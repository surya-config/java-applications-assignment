package day4;

import java.util.Scanner;

public class ShapesInheritance {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select an option: ");
		System.out.println("1.Find area of Circle ");
		System.out.println("2.Find perimeter of Circle");
		System.out.println("3.Find area of Rectangle");
		System.out.println("4.Find perimeter of Rectangle");
		System.out.println("5.Find area of Triangle");
		System.out.println("6.Find perimeter of Triangle");
		int choice = scan.nextInt();
		
		while(choice != 0) {
			switch(choice) {
			case 1: 
				System.out.println("Enter radius of the circle: ");
				float radius = scan.nextFloat();
				Circle c = new Circle(radius);
				c.findArea();	
				break;
			case 2: 
				System.out.println("Enter radius of the circle: ");
				float radius1 = scan.nextFloat();
				Circle c1 = new Circle(radius1);
				c1.findPerimeter();
				break;
			case 3: 
				System.out.println("Enter length of the rectangle: ");
				float length1 = scan.nextFloat();
				System.out.println("Enter breadth of the rectangle: ");
				float breadth1 = scan.nextFloat();
				Rectangle r = new Rectangle(length1,breadth1);
				r.findArea();	
				break;
			case 4:
				System.out.println("Enter length of the rectangle: ");
				float length2 = scan.nextFloat();
				System.out.println("Enter breadth of the rectangle: ");
				float breadth2 = scan.nextFloat();
				Rectangle r1 = new Rectangle(length2,breadth2);
				r1.findPerimeter();	
				break;
			case 5: 
				System.out.println("Enter base of the triangle: ");
				float base1 = scan.nextFloat();
				System.out.println("Enter height of the triangle: ");
				float height1 = scan.nextFloat();
				System.out.println("Enter hypotenuse of the triangle: ");
				float hyp1 = scan.nextFloat();
				Triangle t = new Triangle(base1,height1,hyp1);
				t.findArea();
				break;
			case 6: 
				System.out.println("Enter base of the triangle: ");
				float base2 = scan.nextFloat();
				System.out.println("Enter height of the triangle: ");
				float height2 = scan.nextFloat();
				System.out.println("Enter hypotenuse of the triangle: ");
				float hyp2 = scan.nextFloat();
				Triangle t1 = new Triangle(base2,height2,hyp2);
				t1.findPerimeter();
				break;
			}
			System.out.println("Do you want to continue(0/1)?");
			choice = scan.nextInt();
			if(choice != 0) {
				System.out.println("Select an option: ");
				System.out.println("1.Find area of Circle ");
				System.out.println("2.Find perimeter of Circle");
				System.out.println("3.Find area of Rectangle");
				System.out.println("4.Find perimeter of Rectangle");
				System.out.println("5.Find area of Triangle");
				System.out.println("6.Find perimeter of Triangle");
				choice = scan.nextInt();
			}
		}
		
		scan.close();
	}

}
