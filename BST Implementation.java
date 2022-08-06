import java.util.Scanner;
class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}

public class BinaryTreeImplementation{
    Node create(){
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your data : ");
        int data = sc.nextInt();
        if (data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left data of your Node : " + root.data);
        root.left = create();
        System.out.println("Enter right data of your Node : " + root.data);
        root.right = create();
        return root;
    }

    void inorder(Node root){    
        if(root == null){
            return;
        }
                                                      /*LNR */
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    void preorder(Node root){
        if(root == null){
            return;
        }                                            /*\NLR */
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root){ 
        if(root == null){
            return;
        }                                             /*LRN */
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args, Node root) {
        BinaryTreeImplementation bt = new BinaryTreeImplementation();
        bt.create();
        bt.preorder(root);
    }
}

