import java.util.*;

public class Creating_Strings {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        String input = ss.nextLine();

        Set<String> res = new TreeSet<>();

        boolean[] used = new boolean[input.length()];
        generateStr(input, "", used, res);
        System.out.println(res.size());
        for (String perm:res) {
            System.out.println(perm);
        }
    }
    public static void generateStr(String str, String prefix, boolean[] used, Set<String> result) {
        if (prefix.length()== str.length()) {
            result.add(prefix);
            return;
        }


        for (int i =0;i< str.length();i++) {
            if (!used[i]) {
                used[i] = true; 
                generateStr(str, prefix + str.charAt(i), used, result);
                used[i] = false;
            }
        }
    }
}