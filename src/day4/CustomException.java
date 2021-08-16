package day4;

import java.util.Scanner;

class MinimumBalanceException extends Exception {

	public MinimumBalanceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class CustomException {
	static void validate(float balance) throws MinimumBalanceException {
		if(balance > 2000) {
			System.out.println("Welcome! You can make the payment.");
		} else {
			throw new MinimumBalanceException("Please add some amount and try again! \n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		try {
			System.out.println("Enter your Bank Balance: ");
			Scanner scan = new Scanner(System.in);
			n = scan.nextInt();
			validate(n);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
