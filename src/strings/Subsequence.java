package strings;

// Check if a String is Subsequence of Other

public class Subsequence {

    // Iterative
    public static boolean check(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int j=0;
        for (int i=0;(i<m && j<n); i++){
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return (j==n);
    }

    // Recursive
    public static boolean check2(String s1, String s2, int m ,int n){
        if (n == 0) {
            return true;
        }
        if (m == 0) {
            return false;
        }

        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return check2(s1,s2,m-1,n-1);
        }else {
            return check2(s1,s2,m-1,n);
        }

    }

    public static void main(String[] args) {
        String s1 = "AEBCD";
        String s2 = "AGBD";
        boolean res = check(s1,s2);
        boolean res2 = check2(s1,s2,s1.length(),s2.length());
        System.out.println(res+" == "+ res2);
    }
}
