import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(8);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(2);
        binarySearchTree.insert(10);
        binarySearchTree.insert(9);
        binarySearchTree.insert(20);
        binarySearchTree.insert(25);
        binarySearchTree.insert(15);
        binarySearchTree.insert(16);

        System.out.println("Original Tree: ");
        binarySearchTree.display(binarySearchTree.root);

        System.out.println("");
        System.out.println("Check whether Node with value 4 exist: " + binarySearchTree.contains(4));
        System.out.println("Check whether Node with value 2 exist: " + binarySearchTree.contains(2));
        System.out.println("Check whether Node with value 90 exist: " + binarySearchTree.contains(90));

        System.out.println("Delete Node with no childeren (2): " + binarySearchTree.delete(2));
        binarySearchTree.display(binarySearchTree.root);
        System.out.println();

        System.out.println("Delete Node with no childeren (4): " + binarySearchTree.delete(4));
        binarySearchTree.display(binarySearchTree.root);
        System.out.println();

        System.out.println("Delete Node with no childeren (10): " + binarySearchTree.delete(10));
        binarySearchTree.display(binarySearchTree.root);
    }    
}
