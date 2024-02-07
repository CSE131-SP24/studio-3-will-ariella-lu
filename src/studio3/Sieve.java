package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input your n:");
		int n = in.nextInt();
		int[] listOfn = new int[n];	
		
		int count = 2;
		while (count <= n)
		{
			for (int i = 2; i <= n; i++)
			{
				listOfn [i-1] = i;
				System.out.println(listOfn[i-1]);
			}
		System.out.println();
		count++;
			
		}
	}

}
