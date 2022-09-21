package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	
		System.out.println("What number you want n to be?");
		int n = in.nextInt(); 
		boolean [] numbers = new boolean [n+1]; 

		
			for(int i = 2; i < (n + 1) ;i++)
			{
				for(int p = 2; p <= n/2 ; p++)
				{
				if(i % p == 0 && i != p)	
		
				{
					numbers [i] = true;
				}
			}

		}
		for(int i = 2; i < (n + 1) ;i++)
		{
			
			if(numbers[i] == false)
			{
		  System.out.println(i);
			}
			






	}
}
}