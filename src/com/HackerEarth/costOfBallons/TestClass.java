package com.HackerEarth.costOfBallons;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

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
            int green=sc.nextInt();
            int purple=sc.nextInt();
            int n=sc.nextInt();
            int case1=0;
            int case2=0;
            for(int i=0;i<n;i++)
            {
               int prob1=sc.nextInt();
               int prob2=sc.nextInt();

               case1=case1+(prob1*green)+(prob2*purple);
               case2=case2+(prob1*purple)+(prob2*green);
            }

            System.out.println(Math.min(case1,case2));
        }
        sc.close();
    }
}

/*
2
9 6
10
1 1
1 1
0 1
0 0
0 1
0 0
0 1
0 1
1 1
0 0
1 9
10
0 1
0 0
0 0
0 1
1 0
0 1
0 1
0 0
0 1
0 0
*/
