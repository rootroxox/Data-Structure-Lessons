public class Main {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue(10);

        myPriorityQueue.enqueue(1);
        myPriorityQueue.enqueue(3);
        myPriorityQueue.enqueue(5);
        myPriorityQueue.enqueue(7);
        myPriorityQueue.enqueue(9);

        System.out.println(myPriorityQueue.isEmpty());
        System.out.println(myPriorityQueue.isFull());
        System.out.println(myPriorityQueue.peek());

        myPriorityQueue.enqueue(2);
        myPriorityQueue.enqueue(4);
        myPriorityQueue.enqueue(6);
        myPriorityQueue.enqueue(8);
        myPriorityQueue.enqueue(10);

        myPriorityQueue.prinntPQ();


    }
}
