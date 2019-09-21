package assignment_2_p3;

import java.util.Scanner;

public class assignment_2_p3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String topics[] = new String[]	{
				"Technology", "Politics", "Space", "Human Nature", "Math"
		};
		int response, n, i, j, maxTotalInd, minTotalInd;
		int[] totals    = new int[]	{0,0,0,0,0};	
		int[][] responses = new int[5][10];
		for (i = 0; i < 5; i++)	{
			for (j = 0; j < 10; j++)	{
				responses[i][j] = 0;
			}
		}
		
		// getting Inputs
		n = 0;
		response = 0;
		
		while (n < 10 && response > -1)	{
			System.out.printf("Hello, user %d, Welcome to my survey!\n\n", n + 1);
			System.out.println("Please rate how important the following topics are to you (from 1 to 10) or input -1 at any time to quit");
			j = 0;
			while (j < 5)	{
				
				System.out.printf("%s :    ", topics[j]);
				response = in.nextInt();
				if (response == -1)	{
					break;
				}
				if (response < 0 || response > 10)	{
					System.out.println("Invalid response, try again");
					continue;
				}
				
				totals[j] += response;
				responses[j][response - 1]++;
				j++;
			}
			System.out.printf("\n");
			n++;
		}
		
				
		// tabular Report
		System.out.printf("%-13s %3d %3d %3d %3d %3d %3d %3d %3d %3d %3d %10s\n\n", "Topics", 1,2,3,4,5,6,7,8,9,10,"Average");
		for (i = 0; i < 5; i++)	{
			System.out.printf("%-13s ", topics[i]);
			for (j = 0; j < 10; j++)	{	
				System.out.printf("%3d ",responses[i][j]);
				
			}
			System.out.printf("%8.2f", totals[i]/(double)n
					);
			System.out.printf("\n");
		}
		// find maxTotal and minTotal
		maxTotalInd = 0;
		minTotalInd = 0;
		for (i = 0; i < 5; i++)	{
			if (totals[i] > totals[maxTotalInd])	{
				maxTotalInd = i;
			}
		}
		 
		for (i = 0; i < 5; i++)	{
			if (totals[i] < totals[minTotalInd])	{
				minTotalInd = i;
			}
		}
		System.out.printf("\nHighest Point Total: %13s %3d\n\n", topics[maxTotalInd], totals[maxTotalInd]);
		System.out.printf("Lowest Point Total: %14s %3d\n", topics[minTotalInd], totals[minTotalInd]);
		
		in.close();
	}

}
