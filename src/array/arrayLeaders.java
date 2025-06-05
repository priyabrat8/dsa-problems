package array;

// You are given an array arr of positive integers.
// Your task is to find all the leaders in the array.
// An element is considered a leader if it is greater than or equal to all elements to its right.
// The rightmost element is always a leader.

import java.util.ArrayList;
import java.util.Collections;

public class arrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        int n = arr.length;
        int l = arr[n-1];
        t.add(l);
        for(int i=n-2; i >= 0;i--){
            if(arr[i]>=l){
                l = arr[i];
                t.add(l);
            }
        }
        Collections.reverse(t);
        return t;
    }

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> t = leaders(arr);
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));
        }
    }
}
