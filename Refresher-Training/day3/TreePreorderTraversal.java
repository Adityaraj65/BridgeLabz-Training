package day3;

import java.util.Scanner;

class TNode {
    TNode left;
    TNode right;
    int data;
    
    TNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TreePreOrderTraversal {

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(TNode root) {
    if (root == null) {
        return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
    }

	public static TNode insert(TNode root, int data) {
        if(root == null) {
            return new TNode(data);
        } else {
            TNode cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        TNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }	
}
