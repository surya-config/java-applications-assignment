package day4;

import java.io.*;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = Integer.parseInt(scan.nextLine());
		
		// Arithmetic Exception
		try {
			if((50%number) == 0) {
				System.out.println(number + " is a factor of 50");
			} else {
				System.out.println(number + " is not a factor of 50");
			}
		} catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
		// ArrayIndexOutOfBoundsException
		int[] arr = {10,20,30,40,50};
		System.out.println("Array Elements are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the index of the element you require: ");
		
		try {
			int index = scan.nextInt();
			System.out.println("Element at the index "+ index + " is: "+arr[index]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
		
		// FileNotFoundException
		try {
			File file = new File("file.txt");
			PrintWriter pw = new PrintWriter(new FileWriter(file),true);
			pw.println("Hello World!");
			pw.close();
			file.setReadOnly();
			
			PrintWriter pw1 = new PrintWriter(new FileWriter("file.txt"),true);
			pw1.println("Hello World");
		} catch(Exception fe) {
			System.out.println(fe);
		}
		
		scan.close();
	}
}
