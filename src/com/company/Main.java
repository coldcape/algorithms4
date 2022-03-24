package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main (String[] argv) throws FileNotFoundException {

        binaryTree tree = new binaryTree();

        File file = new File("src/com/company/textInput.txt");
        Scanner read = new Scanner(file);

        while (read.hasNext()){
            String linje = read.nextLine();
            String setning = linje.replaceAll("[^a-zA-Z0-9]", " ");
            setning = linje.replaceAll("  ", " ");


            String[] ord = setning.split(" ");
            for (String o: ord){
                tree.leggTilNode(o.toUpperCase());
            }
        }
        tree.inorder();
    }
}
