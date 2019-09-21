package assignment_2_p1;

import java.util.Scanner;


public class assignment_2_p1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int i, word, firstDigit, secondDigit, thirdDigit, fourthDigit;
		word = scnr.nextInt();
		firstDigit  = word / 1000;
		secondDigit = (word / 100)%10;
		thirdDigit  = (word / 10)%10;
		fourthDigit = (word%10);
		// just a check to makes sure we get the digits right
		//System.out.printf("%d %d %d %d\n",firstDigit, secondDigit, thirdDigit, fourthDigit);
	
		firstDigit  = (firstDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit  = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;
		
		System.out.printf("%d%d%d%d\n",thirdDigit, fourthDigit, firstDigit, secondDigit);
		
	
	}

}
