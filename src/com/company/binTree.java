/* package com.company;

public class binTree {

    // Inner class for binary tree nodes with single-character data
    private class treeNode
    {
        char data;
        binaryTree.treeNode left, right;

        public treeNode(char value)
        {
            data = value;
            left = right = null;
        }

        void write()
        {
            System.out.print(data + " ");
        }
    }

    // Root of entire search tree
    private binaryTree.treeNode root;

    // Constructor, creates empty tree
    public void binarySearchTree()
    {
        root = null;
    }

    // Check for empty tree
    public boolean isEmpty()
    {
        return (root == null);
    }


    //
    // Iterative search in binary search tree
    //
    public boolean search(char value)
    {
        binaryTree.treeNode current = root;

        while (current != null)
        {
            if (current.data == value)
                return true;
            if (value < current.data)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }


    //
    // Insertion of new value into binary search tree
    //
    public void insert(char value)
    {
        binaryTree.treeNode newNode = new binaryTree.treeNode(value);

        // Create new root if tree is empty
        if (isEmpty())
        {
            root = newNode;
            return;
        }

        binaryTree.treeNode current = root;
        boolean finished = false;

        // Insert new node as a leaf in the tree
        while (!finished)
        {
            if (value < current.data)
            {
                if (current.left == null)
                {
                    current.left = newNode;
                    finished = true;
                }
                else
                    current = current.left;
            }
            else
            {
                if (current.right == null)
                {
                    current.right = newNode;
                    finished = true;
                }
                else
                    current = current.right;
            }
        }
    }



}
*/