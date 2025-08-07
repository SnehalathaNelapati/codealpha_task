package cse;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt(),f = 1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);
		}
		
		

	}


