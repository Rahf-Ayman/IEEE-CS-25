#include <iostream>
#include <queue>
#include <vector>
#include <cstring>

using namespace std;


int dx[]={2, 2, -2, -2, 1, 1, -1, -1};
int dy[]={1, -1, 1, -1, 2, -2, 2, -2};
void convert(string pos, int &x, int &y) {
    x= pos[0]-'a';
    y= pos[1]-'1';
}

int bfs(int startX, int startY, int endX, int endY) {
    vector<vector<bool>> v(8, vector<bool>(8, false));
    queue<pair<int, int>> q;
    v[startX][startY] = true;
    q.push({startX, startY});
    int mm=0;

    while (!q.empty()) {
        int size=q.size();
        for (int i=0; i<size; i++) {
            int x=q.front().first;
            int y=q.front().second;
            q.pop();

            if (x==endX && y==endY) {
                return mm;
            }

            for (int j = 0; j < 8; j++) {
                int nx=x+dx[j];
                int ny=y+dy[j];

                 if (nx>=0&& ny>=0 && nx<8 && ny<8 && !v[nx][ny]) {
                    v[nx][ny]=true;
                    q.push({nx, ny});
                }
            }
        }
        mm++;
    }
    return -1;
}

int main() {
    int T;
    cin>> T;
    while (T--) {
        string start, end;
        cin >> start >> end;
        int startX, startY, endX, endY;
        convert(start, startX, startY);
        convert(end, endX, endY);
         cout << bfs(startX, startY, endX, endY) << endl;
    }
    return 0;
}

