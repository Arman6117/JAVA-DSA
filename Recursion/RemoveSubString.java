package Recursion;

public class RemoveSubString {
    static  String removeSub(String str, StringBuilder ans, int i) {
        if (i == str.length()) return ans.toString();

        if (!str.startsWith("APPLE")) {
            ans.append(str.charAt(i));
        }
        return  removeSub(str.substring(5),ans,i +1);
    }
    public static void main(String[] args) {
        String str = "SUBSTRINGAPPLE";
        String ans = "";
        ans = removeSub(str, new StringBuilder(), 0);
        System.out.println(ans);

    }
}
