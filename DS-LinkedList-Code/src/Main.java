public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.prepend(6);
        linkedList.deleteWithValue(1);
        linkedList.deleteWithValue(6);
        System.out.println(linkedList);

    }
}
