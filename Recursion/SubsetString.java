package Recursion;

public class SubsetString {
    public static void main(String[] args) {
        subStr("", "abc");
    }

    static void subStr(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println("[ " + ans +" ]");
            return;
        }
        char ch = str.charAt(0);
        subStr(ans + ch, str.substring(1)); // Taking the character
        subStr(ans,str.substring(1)); // Ignoring the character
    }
}
