/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1
 */
public class BST {
    Node root;
    class Node{
        Node left,right;
        char key;
        public Node(char key){
            this.key = key;
        }
    }
    public void insert(char key){
        root = insertInTree(root,key);
    }
    public Node insertInTree(Node root,char key){
        /*
          if node less than root node insert to the left
          if node greater than root node insert to the right
        */
        if(root == null){//create root node
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertInTree(root.left, key);
        }else if(key > root.key){
            root.right = insertInTree(root.right, key);
        }
        return root;
    }
    public void inorderTraversal(Node n){
        //L- Ro - R(Left node, Root node, right node)
        if(n != null){
            inorderTraversal(n.left);
            System.out.print(n.key+" ");
            inorderTraversal(n.right);
        }
    }
    public void preorderTraversal(Node n){
        //Ro - L - R(Root node, Left node, right node)
        if(n != null){
            System.out.print(n.key+" ");
            inorderTraversal(n.left);
            inorderTraversal(n.right);
        }
    }
    public void postorderTraversal(Node n){
        //L - R - Ro(Left node, right node, Root node)
        if(n != null){
            inorderTraversal(n.left);
            inorderTraversal(n.right);
            System.out.print(n.key+" ");
        }
    }
}
