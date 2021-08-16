package day4;

public class Rectangle extends Shape {
	private float length,breadth;

	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getBreadth() {
		return breadth;
	}


	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}


	@Override
	public void findArea() {
		float area = length*breadth;
		System.out.println("Area of the rectangle with length " + length + "and breadth " + breadth + "is: " + area);
	}

	@Override
	public void findPerimeter() {
		float perimeter = 2*(length+breadth);
		System.out.println("Perimeter of the rectangle with length " + length + "and breadth " + breadth + "is: " + perimeter);
	}
	
}
