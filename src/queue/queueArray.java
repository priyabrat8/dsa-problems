package queue;

class myQueue {
    int cap;
    int size;
    int []arr;

    myQueue(int cap){
        this.cap = cap;
        this.size = 0;
        arr = new int[cap];
    }

    boolean isFull(){
        return (size == cap);
    }

    boolean isEmpty(){
        return (size == 0);
    }

    void enqueue(int x){
        if (isFull()) {
            System.out.println("Overflow");
            return ;
        }
        arr[size] = x;
        size++;
    }

    void dequeue(){
        if (isEmpty()) {
            System.out.println("Underflow");
            return ;
        }
        for (int i = 0; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    int getRear(){
        if (isEmpty()) {
            return -1;
        }
        return size-1;
    }

    int getFront(){
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }
}

public class queueArray {
    public static void main(String[] args) {
        myQueue q = new myQueue(10);
        System.out.println(q.isFull());
        q.enqueue(10);
        q.enqueue(45);
        q.enqueue(50);
        System.out.println(q.isEmpty());
        System.out.println(q.getRear());
        System.out.println(q.getFront());
        q.dequeue();
        System.out.println(q.getFront());
        System.out.println(q.getRear());

    }
}
