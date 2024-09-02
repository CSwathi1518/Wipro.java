// Tree Structure:
// 1 
// 2 3
// 4 5 6 7
// Inorder Traversal: 4 2 5 1 6 3 7 
// Preorder Traversal: 1 2 4 5 3 6 7 
// Postorder Traversal: 4 5 2 6 7 3 1 


import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    BinaryTree(int rootValue) {
        root = new TreeNode(rootValue);
    }

    // Insert a node in the binary tree (simple example: insert as left or right child)
    void insertLeft(TreeNode parent, int value) {
        if (parent.left == null) {
            parent.left = new TreeNode(value);
        } else {
            System.out.println("Left child already exists.");
        }
    }

    void insertRight(TreeNode parent, int value) {
        if (parent.right == null) {
            parent.right = new TreeNode(value);
        } else {
            System.out.println("Right child already exists.");
        }
    }

    // Inorder traversal (Left -> Root -> Right)
    void inorderTraversal(TreeNode node) {
        if (node == null) return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Preorder traversal (Root -> Left -> Right)
    void preorderTraversal(TreeNode node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    // Postorder traversal (Left -> Right -> Root)
    void postorderTraversal(TreeNode node) {
        if (node == null) return;

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    
    // Print the binary tree in a structured format
    void printTree() {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            while (levelSize > 0) {
                TreeNode currentNode = queue.poll();
                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);

                levelSize--;
            }

            System.out.println(); // Move to the next line after printing a level
        }
    }
}

public class treenodeds {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(1); // Create a tree with root value 1

        // Insert left and right children of the root
        myTree.insertLeft(myTree.root, 2);
        myTree.insertRight(myTree.root, 3);

        // Insert children of node with value 2
        myTree.insertLeft(myTree.root.left, 4);
        myTree.insertRight(myTree.root.left, 5);

        // Insert children of node with value 3
        myTree.insertLeft(myTree.root.right, 6);
        myTree.insertRight(myTree.root.right, 7);
        
        System.out.println("Tree Structure:");
        myTree.printTree();

        // Inorder traversal
        System.out.print("Inorder Traversal: ");
        myTree.inorderTraversal(myTree.root);
        System.out.println();

        // Preorder traversal
        System.out.print("Preorder Traversal: ");
        myTree.preorderTraversal(myTree.root);
        System.out.println();

        // Postorder traversal
        System.out.print("Postorder Traversal: ");
        myTree.postorderTraversal(myTree.root);
        System.out.println();
    }
}