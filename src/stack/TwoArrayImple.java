package stack;

class twoArrImpl {
    private int arr[];
    private int cap;
    private int top1,top2;

    twoArrImpl(int cap){
        this.cap = cap;
        arr = new int[cap];
        this.top1 = -1;
        this.top2 = cap;
    }

    void push1(int x){
        if (top1+1 < top2) {
            top1++;
            arr[top1] = x;
        }
        else{
            System.out.println("Stack Overflow!!");
        }
    }

    void push2(int x){
        if (top2-1 > top1) {
            top2--;
            arr[top2] = x;
        }
        else{
            System.out.println("Stack Overflow!!");
        }
    }

    int pop1(){
        if (top1 != -1) {
            int temp = arr[top1];
            top1--;
            return temp;
        }else {
            System.out.println("Stack Underflow!!");
            return -1;
        }
    }

    int pop2(){
        if (top2 < cap) {
            int temp = arr[top2];
            top2++;
            return temp;
        }else {
            System.out.println("Stack Underflow!!");
            return -1;
        }
    }

    int size1(){
        return (top1+1);
    }

    int size2(){
        return (top2-1);
    }

}

public class TwoArrayImple {
    public static void main(String[] args) {
        twoArrImpl s1 = new twoArrImpl(10);
        s1.push1(10);
        s1.push2(70);
        System.out.println(s1.pop2());
        s1.pop2();
    }
}
