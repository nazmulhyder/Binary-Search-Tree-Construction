package BST;

class Node{

    int key;
    String name;
    Node leftChild;
    Node rightChild;

    Node(int key,String name){
        this.key = key;
        this.name = name;
    }

    public  String toString(){
        return  name+ " has a key "+key;
    }

}

public class BST_Construction {
    Node root;
    public void addNode(int key,String name){
        Node newNode = new Node(key,name);
        if (root == null){
            root = newNode;
        }
        else {
            Node focusNode = root;
            Node parent;
            while (true){

                parent = focusNode;
                if (key<focusNode.key){
                    focusNode = focusNode.leftChild;
                    if (focusNode==null){

                        parent.leftChild = newNode;
                        return;
                    }

                }
                else {

                    focusNode = focusNode.rightChild;
                    if (focusNode==null){
                        parent.rightChild = newNode;
                        return;
                   }

                }
            }
        }


    }

    public void inOrderTraverseTree(Node focusNode){
        if (focusNode!=null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    public void preOrderTraverseTree(Node focusNode){
        if (focusNode!=null){
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode){
        if (focusNode!=null){
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public static void main(String[] args){
        BST_Construction bst_construction = new BST_Construction();
        System.out.println("This is Inorder Traversal(Left,Root,Right): ");
        bst_construction.addNode(50,"nishat");
        bst_construction.addNode(25,"medel");
        bst_construction.addNode(15,"abhi");
        bst_construction.addNode(30,"alamin");
        bst_construction.addNode(75,"tareq");
        bst_construction.addNode(85,"sohan");
        bst_construction.inOrderTraverseTree(bst_construction.root);
        System.out.println("This is preOrder Traversal(Root,Left,Right): ");
        bst_construction.preOrderTraverseTree(bst_construction.root);
        System.out.println("This is postOrder Traversal(Left,Right,Root): ");
        bst_construction.postOrderTraverseTree(bst_construction.root);



    }
}
