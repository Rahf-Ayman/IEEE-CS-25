#include <iostream>
#include <vector>
#include <queue>
using namespace std;

void bfs(int start, vector<vector<int>>& graph, vector<bool>& v) {
    queue<int> q;
    q.push(start);
    v[start] = true;
     while (!q.empty()) {
        int c =q.front();
        q.pop();
        for (int i : graph[c ]) {
            if (!v[i]) {
                v[i] = true;
                q.push(i);
            }
        }
    }
}

int main() {
    int n, m;
    cin >> n >> m;
    vector<vector<int>> graph(n + 1);
      vector<bool> v(n + 1, false);
    vector<int> r;


    for (int i = 0; i < m; i++) {
        int a, b;
        cin >>a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }

    for (int i = 1; i <= n; i++) {
        if (!v[i]) {
            r.push_back(i);
            bfs(i, graph, v);
        }
    }

   int rr = r.size() - 1;
    cout <<rr<< endl;
    for (int i=1; i<r.size(); i++) {
        cout << r[i-1] <<" "<<r[i]<<endl;
    }
    return 0;
}

