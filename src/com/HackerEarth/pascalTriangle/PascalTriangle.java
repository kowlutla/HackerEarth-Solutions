package com.HackerEarth.pascalTriangle;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows: ");
		int n=sc.nextInt();
		int array[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i)
				{
					array[i][j]=1;
				}
				else
				{
					array[i][j]=array[i-1][j-1]+array[i-1][j];
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				if(array[i][j]!=0)
					System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
