public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        this.arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Underflow!");
            System.exit(-1);
        }

        System.out.println("Removing " + arr[front]);
        front = (front + 1) % capacity;
        count--;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Overflow!");
            System.exit(-1);
        }

        System.out.println("Inserting " + data);
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        count++;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow!");
            System.exit(-1);
        }
        return arr[front];
    }

    public boolean isFull() {
        return (size() == capacity);
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public int size() {
        return count;
    }
}
