package queue;

class Node {
    int x;
    Node next;
    Node(int x){
        this.x = x;
        this.next = null;
    }
}

class myQueue2{
    Node head;
    Node rear;

    myQueue2(){
        this.head = this.rear = null;
    }

    boolean isEmpty(){
        return (head == null);
    }

    void enqueue(int x){
        Node temp = new Node(x);
        if (rear == null) {
            rear=head=temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    void dequeue(){
        if (isEmpty()) {
            System.out.println("Underflow");
            return ;
        }
        head = head.next;
        if (head == null) {
            rear = null;
        }
    }

    int getRear(){
        if (isEmpty()) {
            return -1;
        }
        return rear.x;
    }

    int getFront(){
        if (isEmpty()) {
            return -1;
        }
        return head.x;
    }
}

public class queueLinkedList {
    public static void main(String[] args) {
        myQueue2 q = new myQueue2();
        q.enqueue(18);
        q.enqueue(45);
        System.out.println(q.getRear());
        q.enqueue(50);
        System.out.println(q.isEmpty());
        System.out.println(q.getRear());
        System.out.println(q.getFront());
        q.dequeue();
        System.out.println(q.getFront());


    }
}
