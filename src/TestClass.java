import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
//        PrintWriter wr = new PrintWriter(System.out);
//        Scanner sc=new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int t_i=0; t_i<T; t_i++)
//        {
//            int n = sc.nextInt();
//
//            int out_ = solve(n);
//            System.out.print(out_);
//            System.out.print(" ");
//         }

//         wr.close();
    	System.out.println("Decimal: "+isDecimalPalindrome(11));
    	System.out.println("Decimal: "+isDecimalPalindrome(12));
    	System.out.println("Decimal: "+isDecimalPalindrome(3));
    	
    	System.out.println("IsBinary: "+isBinaryPalindrome(1));
    	System.out.println("IsBinary: "+isBinaryPalindrome(2));
    	System.out.println("IsBinary: "+isBinaryPalindrome(3));
    }
    static int solve(int n){
        // Write your code here
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(isBinaryPalindrome(i) &&  isDecimalPalindrome(i)){
                count++;
            }
        }
        return count;
    }

    static boolean isBinaryPalindrome(int n)
    {
        String s=Integer.toBinaryString(n);
        int len=s.length();
        for (int i = 0; i < (len/2); ++i) {
        	  if (s.charAt(i) != s.charAt(len - i - 1)) {
        	         return false;
        	        }
        	  }
        	 return true;
    }

    static boolean isDecimalPalindrome(int n){
        int temp=n;
        int rev=0;
        while(temp>0){
            rev=rev*10+(temp%10);
            temp=temp/10;
        }

        return n==rev;
    }
}