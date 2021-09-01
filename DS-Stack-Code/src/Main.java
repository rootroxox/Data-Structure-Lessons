public class Main {
    public static void main(String[] args) {
        LinkedListBasedStack llb = new LinkedListBasedStack();

        llb.push(1);
        llb.push(2);
        llb.push(3);
        llb.push(4);
        llb.push(5);
        llb.push(6);
        llb.push(7);
        llb.push(8);
        llb.push(9);

        System.out.println("Top: " + llb.peek());

        llb.pop();

        System.out.println("Top: " + llb.peek());
        System.out.println("Top: " + llb.peek());

        System.out.println("Stack is empty: " + llb.isEmpty());
    }
}
