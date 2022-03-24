package com.company;


public class binaryTree {
    treNode root;

    public binaryTree() {
        this.root = null;
    }

    private static class treNode {
        String data;
        treNode left, right;

        public int count = 1;

        public treNode(String data) {
            this.data = data;
            left = right = null;
        }

        // Ikke elegant, men det fungerer...
        void write()
        {
            System.out.print("\n" + this.data + " [" + count + "] ,");
        }


    }



    public boolean tomTree(){

        return root == null;
    }

    public void leggTilNode(String data){


        if (tomTree()){
            this.root = new treNode(data);
        }
        else {
            treNode current = this.root;


            boolean innsetting = true;
            while (innsetting){
                int compare = data.compareTo(current.data);

                if (compare == 0){ // Verdien pa strengene er like
                    current.count++;
                    innsetting = false;
                }
                else if (compare < 0){ // Mindre enn null betyr at stringen kommer alfabetisk for verdien vi sammenligner mer
                    if (current.left == null) {
                        current.left = new treNode(data);
                    }
                    current = current.left;
                }
                else {
                    if (current.right == null) {
                        current.right = new treNode(data);
                    }
                    current = current.right;

                }
            }
        }

    }


    // Printout of inorder tree traversal, for demo purposes
    //
    public void inorder()
    {
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println("\n");
    }

    private void inorder(treNode t)
    {
        if (t != null)
        {
            inorder(t.left);
            t.write();
            inorder(t.right);
        }
    }


}



