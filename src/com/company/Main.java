package com.company;

import java.io.*;

public class Main {

    public static void main (String[] argv)
    {
        BufferedReader r =
                new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer input = new StreamTokenizer(r);

        try
        {
            int x = input.nextToken();
            while (x != input.TT_EOF)
            {
                if (input.ttype == input.TT_WORD)
                    System.out.println(input.sval);
                x = input.nextToken ();
            }
        }
        catch (IOException e) {};

        binaryTree()
    }

}
