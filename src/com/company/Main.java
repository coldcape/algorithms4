package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main (String[] argv)
    {
        Scanner scanner = new Scanner("textInput.txt");

        while (scanner.hasNext()){
            System.out.println(scanner.next());
            String linje = scanner.nextLine();
            String[] ord = linje.split("[\\s\\p{Punct}]+");

            for (int i = 0; i < ord.length; i++){
                ord[i].toUpperCase();
                binaryTree.insert(ord[i].toUpperCase());
            }
        }


    }

}
