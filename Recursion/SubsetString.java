package Recursion;

import java.util.ArrayList;

public class SubsetString {
    public static void main(String[] args) {
//        subStr("", "abc");
        System.out.println(subSeqRet("", "abc"));
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

    static ArrayList<String> subSeqRet (String ans,String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return  list;
        }

        char ch = str.charAt(0);
        ArrayList <String> leftAns = subSeqRet(ans + ch, str.substring(1));
        ArrayList <String> rightAns = subSeqRet(ans, str.substring(1));

        leftAns.addAll(rightAns);
        return leftAns;
    }
}
