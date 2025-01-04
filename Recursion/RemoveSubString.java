package Recursion;

public class RemoveSubString {
    static  String removeSub(String str) {
         if (str.isEmpty()) return "";

         if (str.startsWith("APPLE")) {
             return removeSub(str.substring(5));
         } else {
             return str.charAt(0) + removeSub(str.substring(1));
         }

          }
    public static void main(String[] args) {
        String str = "SUBSTRINGAPPLE";
        String ans = "";
        ans = removeSub(str);
        System.out.println(ans);

    }
}
