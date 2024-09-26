package oopsPractise;

abstract class shape {

	public abstract double calculateArea();
	
	public void abstractMethod() {
		System.out.println("This is abstract");
	}

	double pi = 3.14;
}

class circle extends shape {
	private int radius;

	public circle(int radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return radius * pi * radius;
	}
}

class rectangle extends shape {

	private int length, width;

	public rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return length * width;
	}
}

class display extends shape{

	@Override
	public double calculateArea() {
		return 0;
	}
}

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangle r = new rectangle(5,10);
		circle c = new circle (5);
		display d = new display();
		
		System.out.println("Area of rectangle is "+r.calculateArea());
		System.out.println("Area of circle is "+c.calculateArea());
		d.abstractMethod();

	}

}
