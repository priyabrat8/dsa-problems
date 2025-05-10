package stack;

import java.util.ArrayDeque;

public class stockSpanProblem {
    public static void stockSpan(int arr[]){
        ArrayDeque<Integer> leftG = new ArrayDeque<Integer>();
        leftG.push(0);
        System.out.print(1+ " ");
        for (int i = 1; i < arr.length; i++) {
            while (!leftG.isEmpty() && arr[leftG.peek()] <= arr[i]) {
                leftG.pop();
            }
            int span = leftG.isEmpty() ? i+1: i-leftG.peek();
            System.out.print(span+ " ");
            leftG.push(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {30,20,25,28,26,29};
        stockSpan(arr);
    }
}
