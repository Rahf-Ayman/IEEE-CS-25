import java.util.Scanner;

public class Keyboard {
    static String sq ="qwertyuiop[]asdfghjkl;'zxcvbnm,./";
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String hh= s.next();
        String in = s.next();
        StringBuilder jj =new StringBuilder();

        if(hh.equals("R")){
            for(int i=0;i<in.length();i++){
                int k = sq.indexOf(in.charAt(i));

                jj.append(sq.charAt(k-1));
            }
        }else{
            for(int i=0;i<in.length();i++){
                int k = sq.indexOf(in.charAt(i));

                jj.append(sq.charAt(k+1));
            }
        }
        System.out.println(jj);




    }
}