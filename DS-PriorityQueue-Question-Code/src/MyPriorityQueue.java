public class MyPriorityQueue {
    private int MAX;
    private int[] arr;
    private int nItems;

    public MyPriorityQueue(int capacity){
        MAX = capacity;
        arr = new int[MAX];
        nItems = 0;
    }

    public void enqueue(int data){
        int i;

        if(nItems == 0){
            arr[0] = data;
            nItems++;
            return;
        }

        for (i = nItems-1; i >= 0; i--) {
            if(data > arr[i]){
                arr[i+1] = arr[i];
            } else {
                break;
            }
        }

        arr[i+1] = data;
        nItems++;
    }

    public int dequeue(){
        return arr[--nItems];
    }

    public int peek(){
        return arr[nItems-1];
    }

    public void prinntPQ(){
        for (int i = 0; i < nItems; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public boolean isFull(){
        return nItems == MAX;
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

}
