public class Main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(6);
        System.out.println("Minimum: " + stack.min());

        stack.push(7);
        System.out.println("Minimum: " + stack.min());

        stack.push(8);
        System.out.println("Minimum: " + stack.min());

        stack.push(5);
        System.out.println("Minimum: " + stack.min());

        stack.push(3);
        System.out.println("Minimum: " + stack.min());

        stack.pop();
        System.out.println("Minimum: " + stack.min());

        stack.push(10);
        System.out.println("Minimum: " + stack.min());

        stack.pop();
        System.out.println("Minimum: " + stack.min());

        stack.pop();
        System.out.println("Minimum: " + stack.min());
    }
}
