package com.company;public


class binaryTree {

    private class treeNode{

        char data;
        treeNode left;
        treeNode right;

        public treeNode(char value){

            data = value;
            left = right = null;
        }

        void write(){

            System.out.println(data );
        }
    }

    // Root of search tree
    private binaryTree.treeNode root;

    public void binarySearchTree()
    {
        root = null;
    }

    public boolean isTreeEmpty()
    {
    return (root == null)
    }


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

    public insert(char value)
    {

        binaryTree.treeNode newNode = new binaryTree.treeNode(value);

        if (isTreeEmpty())
        {

            root = newNode;
            return;

        }

        binaryTree.treeNode current = root;
        boolean finished = false;

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
                    current = current.right;
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
