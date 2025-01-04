package Recursion;

public class RemoveAllA {
    static String remove(String str, StringBuilder ans, int i) {
        if (i == str.length()) return ans.toString();

        if (str.toLowerCase().charAt(i) != 'a') {
            ans.append(str.charAt(i));
        }

        return remove(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "BACCAD";
        String ans = "";
        ans = remove(str, new StringBuilder(), 0);
        System.out.println(ans);
    }
}
