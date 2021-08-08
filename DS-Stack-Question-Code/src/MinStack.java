import java.util.Stack;

public class MinStack {
    private Stack<Integer> main;
    private Stack<Integer> aux;

    //Constructor
    public MinStack(){
        main = new Stack<>();
        aux = new Stack<>();
    }

    public void push(int x){
        main.push(x);
        System.out.println(x + " pushed into stack");

        if(aux.empty()){
            aux.push(x);
        }
        else{
            if(aux.peek() >= x){
                aux.push(x);
            }
        }
    }

    public int pop(){

        if(main.empty()){
            System.out.println("Stack Underflow!");
            return -1;
        }

        int top = main.pop();
        System.out.println(top + " popped from stack");

        if(top == aux.peek()){
            aux.pop();
        }

        return top;
    }

    public int peek(){
        return main.peek();
    }

    public int size(){
        return main.size();
    }

    public boolean isEmpty(){
        return main.empty();
    }

    public int min(){
        if(aux.empty()){
            System.out.println("Stack Underflow!");
            return -1;
        }
        return aux.peek();
    }
}
