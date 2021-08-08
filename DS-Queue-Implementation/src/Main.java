public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("The front element is " + queue.peek());
        queue.dequeue();
        System.out.println("The front element is " + queue.peek());

        System.out.println("The size of the queue is " + queue.size());

        queue.dequeue();
        queue.dequeue();

        if(queue.isEmpty()){
            System.out.println("The queue is empty!");
        }
        else{
            System.out.println("The queue is not empty!");
        }
    }
}
