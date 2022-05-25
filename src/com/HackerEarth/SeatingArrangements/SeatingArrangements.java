package com.HackerEarth.SeatingArrangements;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int seat=sc.nextInt();
            int result=seat%12;
            switch(result)
            {
                case 1:
                {
                    System.out.println((11+seat)+" WS");
                    break;
                }
                case 2:
                {
                    System.out.println((9+seat)+" MS");
                    break;
                }
                case 3:
                {
                    System.out.println((7+seat)+" AS");
                    break;
                }
                case 4:
                {
                    System.out.println((5+seat)+" AS");
                    break;
                }
                case 5:
                {
                    System.out.println((3+seat)+" MS");
                    break;
                }
                case 6:
                {
                    System.out.println((1+seat)+" WS");
                    break;
                }
                case 7:
                {
                    System.out.println((seat-1)+" WS");
                    break;
                }
                 case 8:
                {
                    System.out.println((seat-3)+" MS");
                    break;
                }
                 case 9:
                {
                    System.out.println((seat-5)+" AS");
                    break;
                }
                 case 10:
                {
                    System.out.println((seat-7)+" AS");
                    break;
                }
                 case 11:
                {
                    System.out.println((seat-9)+" MS");
                    break;
                }
                case 0:
                {
                    if(seat==12)
                    {
                        System.out.println((result+1)+" WS");
                    }
                    else if(seat>12)
                    {
                        System.out.println((seat-11)+" WS");
                    }
                    break;
                }
            }
        }
        sc.close();

    }
}
