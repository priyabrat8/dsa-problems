package stack;

import java.util.ArrayDeque;

public class previousGreaterElement {
    public static void prevG(int arr[],int n){
        ArrayDeque<Integer> leftG = new ArrayDeque<Integer>();
        leftG.push(arr[0]);
        System.out.print(-1+ " ");
        for (int i = 1; i < n; i++) {
            while (!leftG.isEmpty() && leftG.peek() <= arr[i]) {
                leftG.pop();
            }
            int greater = leftG.isEmpty() ? -1: leftG.peek();
            System.out.print(greater+ " ");
            leftG.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {20,30,10,5,15};
        prevG(arr,5);
    }
}
