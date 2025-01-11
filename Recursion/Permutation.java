package Recursion;

public class Permutation {
    public static void main(String[] args) {
        String str = "AB";
        per("", str);
    }

    static void per (String ans,String str) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }
            char ch = str.charAt(0);
        int len = ans.length();
        for (int i = 0; i <= len; i++) {
            String f = ans.substring(0,i) ;
            String s = ans.substring(i,ans.length());
            per( f + ch + s,str.substring(1));
        }
    }
}
