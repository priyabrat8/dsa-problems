package strings;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {
 // Q. Given a string, the task is to find the first character (whose leftmost appearance is first) that repeats.

    // Solution 1
    //Only 256 in char to number
    static int check(String str){
        int arr[] = new int[256];
        Arrays.fill(arr,-1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int val = arr[str.charAt(i)];
            if (val == -1) {
                arr[str.charAt(i)] = i;
            }else {
                res = Math.min(res,val);
            }
        }

        return (res==Integer.MAX_VALUE) ? -1 : res;
    }

    // Solution 2
    static int check2(String str){
        boolean arr[] = new boolean[256];
        int res = -1;
        for (int i = str.length()-1; i >= 0; i--) {
            boolean val = arr[str.charAt(i)];
            if (!val) {
                arr[str.charAt(i)] = true;
            }else {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "rugaihanj";
        System.out.println(check(str));
        System.out.println(check2(str));
    }
}
