package assignment_2_p1;

import java.util.Scanner;

public class assignment_2_p1_decrypter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input = scnr.nextInt();
		int firstDigit, secondDigit, thirdDigit, fourthDigit;
		
		firstDigit  = input / 1000;
		secondDigit = (input / 100) % 10;
		thirdDigit  = (input / 10) % 10;
		fourthDigit = (input % 10);
		
		firstDigit  += 3;
		secondDigit += 3;
		thirdDigit  += 3;
		fourthDigit += 3;
		
		System.out.printf("%d%d%d%d\n",thirdDigit, fourthDigit, firstDigit, secondDigit);
		

	}

}
