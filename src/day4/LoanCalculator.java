package day4;

import java.util.Scanner;

interface EMI {
	void calculateEMI(double basic, double time, double rate);
}

class Car implements EMI {
	@Override
	public void calculateEMI(double basic, double time, double rate) {
		rate = rate/(12*100);
		time = time*12;
		double emi = (basic*rate*Math.pow(1+rate,time)-1)/(Math.pow(1+rate, time)-1);
		System.out.println("EMI is = "+emi+"\n");
		
	}
}

class Home implements EMI {
	
	@Override
	public void calculateEMI(double basic, double time, double rate) {
		rate = rate/(12*100);
		time = time*12;
		double emi = (basic*rate*Math.pow(1+rate,time)-1)/(Math.pow(1+rate, time)-1);
		System.out.println("EMI is = "+emi+"\n");
		
	}
	
}

class Education implements EMI {
	@Override
	public void calculateEMI(double basic, double time, double rate) {
		rate = rate/(12*100);
		time = time*12;
		double emi = (basic*rate*Math.pow(1+rate,time)-1)/(Math.pow(1+rate, time)-1);
		System.out.println("EMI is = "+emi+"\n");
		
	}
}


public class LoanCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Select an option: ");
		System.out.println("1.Car Loan ");
		System.out.println("2.Home Loan ");
		System.out.println("3.Education Loan ");
		int choice = scan.nextInt();
		
		while(choice != 0) {
			switch(choice) {
			case 1: 
				System.out.println("Enter amount: ");
				float amount = scan.nextFloat();
				System.out.println("Enter time: ");
				float time = scan.nextFloat();
				Car car = new Car();
				car.calculateEMI(amount, time, 5);
				break;
			case 2: 
				System.out.println("Enter amount: ");
				float amount1 = scan.nextFloat();
				System.out.println("Enter time: ");
				float time1 = scan.nextFloat();
				Home home = new Home();
				home.calculateEMI(amount1, time1,10);
				break;
			case 3: 
				System.out.println("Enter amount: ");
				float amount2 = scan.nextFloat();
				System.out.println("Enter time: ");
				float time2 = scan.nextFloat();
				Education education = new Education();
				education.calculateEMI(amount2, time2, 6);
				break;
			}
			
			System.out.println("Do you want to continue(0/1)?");
			choice = scan.nextInt();
			if(choice != 0) {
				System.out.println("Select an option: ");
				System.out.println("1.Car Loan ");
				System.out.println("2.Home Loan ");
				System.out.println("3.Education Loan ");
				choice = scan.nextInt();
			}
		}
		scan.close();
	}

}
