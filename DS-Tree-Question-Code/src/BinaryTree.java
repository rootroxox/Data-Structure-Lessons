public class BinaryTree {
    Node root;

    public BinaryTree()
    {
        root = null;
    }

    void printLevelOrder()
    {
        int h =  height(root);
        int i;
        for(i = 1; i<=h; i++){
            printCurrentLevel(root, i);
        }
    }

    int height(Node root)
    {
        if(root == null){
            return 0;
        }
        else{
            int lheight = height(root.left);
            int rheight = height(root.right);

            if(lheight > rheight){
                return (lheight+1);
            }
            else{
                return (rheight+1);
            }
        }
    }

    void printCurrentLevel (Node root, int level)
    {
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.data + " ");
        }
        else if(level > 1){
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
}
