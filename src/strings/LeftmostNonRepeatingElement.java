package strings;

import java.util.Arrays;

public class LeftmostNonRepeatingElement {
    // Given a string, the task is to find the leftmost character that does not repeat.

    // Solution 1
    static int check(String str){
        int arr[] = new int[256];  // Char only have 255 num represents

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        int res = -1;
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 1) {
                res = i;
                break;
            }
        }

        return res;
    }

    // Solution 2
    static int check2(String str){
        int arr[] = new int[256];  // Char only have 255 num represents
        Arrays.fill(arr,-1);
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == -1) {
                arr[str.charAt(i)] = i;
            }else {
                arr[str.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (arr[i] >= 0) {
                res = Math.min(res,arr[i]);
            }
        }

        return (res==Integer.MAX_VALUE) ? -1: res;
    }
    public static void main(String[] args) {
        String str = "abbcda";
        System.out.println(check(str));
        System.out.println(check2(str));
    }
}
