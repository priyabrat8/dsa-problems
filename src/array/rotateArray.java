package array;

//Given an array arr[].
// Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer.

import java.util.Arrays;

public class rotateArray {
    static void reverse(int i, int j,int []arr){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static int[] rotateArr(int arr[], int d) {
        int n = arr.length;
        d %= n;
        reverse(0,d-1,arr);
        reverse(d,n-1,arr);
        reverse(0,n-1,arr);
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(rotateArr(arr, 3)));
    }
}
