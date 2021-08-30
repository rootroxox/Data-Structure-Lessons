public class BinarySearchTree {
    public static Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public boolean contains(int data){
        Node current = root;

        while(current != null){
            if(current.data == data){
                return true;
            }
            else if(current.data > data){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }

        return false;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while(true){
            parent = current;
            if(data<current.data){
                current = current.left;
                if(current == null){
                    parent.left = newNode;
                    return;
                }
            }
            else{
                current = current.right;
                if(current==null){
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    public void display(Node root){
        if(root != null){
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }

    public boolean delete(int data){
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;

        while(current.data != data){
            parent = current;
            if(current.data > data){
                isLeftChild = true;
                current = current.left;
            }
            else{
                isLeftChild = false;
                current = current.right;
            }

            if(current == root){
                return false;
            }
        }

        //Case 1 : Has no childs
        if(current.left == null && current.right == null){
            if(current == root){
                root = null;
            }
            if(isLeftChild){
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }

        //Case 2: Has 1 child
        else if(current.right == null){
            if(current == root){
                root = current.left;
            } else if(isLeftChild){
                parent.left = current.left;
            } else{
                parent.right = current.left;
            }
        }

        else if(current.left == null){
            if(current == root){
                root = current.right;
            } else if(isLeftChild){
                parent.left = current.right;
            } else{
                parent.right = current.right;
            }
        }

        //Case 3: Has 2 childs
        else{
            Node successor = getSuccessor(current);

            if(current == root){
                root = successor;
            } else if(isLeftChild){
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }

        return true;
    }

    private Node getSuccessor(Node deleteNode) {
        Node successor = null;
        Node successorParent = null;
        Node current = deleteNode.right;

        while(current != null){
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        if(successor != deleteNode.right){
            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }

        return successor;
    }


    
}
