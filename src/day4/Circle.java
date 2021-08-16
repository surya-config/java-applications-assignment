package day4;

public class Circle extends Shape{
	private float radius;
	private final float pi = 3.14f;

	public Circle(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public void findArea() {
		float area = pi*radius*radius;
		System.out.println("Area of the circle with radius " + radius + "is: " + area);
	}

	@Override
	public void findPerimeter() {
		float perimeter = 2*pi*radius;
		System.out.println("Perimeter of the circle with radius " + radius + "is: " + perimeter);
	}
}
