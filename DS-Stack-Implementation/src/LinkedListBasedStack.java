public class LinkedListBasedStack {
    StackNode root;

    public boolean isEmpty(){
        if(root == null)
            return true;
        else
            return false;
    }

    public void push(int data){
        StackNode newNode = new StackNode(data);

        if(isEmpty()){
            root = newNode;
        }
        else{
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }

        System.out.println(data + " pushed into stack!");
    }

    public int pop(){
        int popped = Integer.MIN_VALUE;

        if(isEmpty()){
            System.out.println("Stack Underflow!");
        }
        else{
            popped = root.data;
            root = root.next;
        }
        System.out.println(popped + " popped into stack!");
        return popped;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return Integer.MIN_VALUE;
        }
        else{
            return root.data;
        }
    }
}
