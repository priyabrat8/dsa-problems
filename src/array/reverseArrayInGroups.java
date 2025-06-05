package array;

//Given an array arr of positive integers. Reverse every sub-array group of size k.
//Note: If at any instance, k is greater or equal to the array size, then reverse the entire array.

import java.util.ArrayList;

public class reverseArrayInGroups {
    static void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();

        for(int i=0; i< n; i=i+k){
            int l = i;
            int j = Math.min(n-1,k+i-1);
            if (k > n){
                j = n-1;
            }

            while(l<j){
                long temp = arr.get(l);
                arr.set(l,arr.get(j));
                arr.set(j,temp);
                l++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(67L);
        arr.add(6L);
        arr.add(7L);
        arr.add(80L);
        arr.add(79L);
        reverseInGroups(arr,3);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
