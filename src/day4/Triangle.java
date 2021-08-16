package day4;

public class Triangle extends Shape {
	private float base,height,hyp;

	public Triangle(float base, float height, float hyp) {
		super();
		this.base = base;
		this.height = height;
		this.hyp = hyp;
	}

	@Override
	public void findArea() {
		float area = 0.5f*base*height;
		System.out.println("Area of the triangle with base " + base + ",height " + height +  "and hypotenuse " + hyp +" is: " + area);
		
	}
	@Override
	public void findPerimeter() {
		float perimeter = base + height + hyp;
		System.out.println("Perimeter of the triangle with base " + base + ",height " + height +  "and hypotenuse " + hyp +" is: " + perimeter);
	}
}
