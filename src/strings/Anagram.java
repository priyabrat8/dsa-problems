package strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    // Naive Solution
    public static boolean anagram(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        char []arr = s1.toCharArray();
        Arrays.sort(arr);
        s1 = new String(arr);

        char []arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        s2 = new String(arr2);

        return s1.equals(s2);
    }

    // Efficient Solution
    public static boolean anagram2(String s1, String s2){
        int arr[] = new int[256];
        for (int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "aabbddec";
        String s2 = "abcdedab";

        boolean res = anagram(s1,s2);
        boolean res2 = anagram2(s1,s2);

        System.out.println(res+" == "+ res2);
    }
}
