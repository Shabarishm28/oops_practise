package oopsPractise;

class calc {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public double add(double a, double b) {
		return a + b;
	}
}

class advcalc extends calc {

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int sub(int a, int b, int c) {
		return a + b - c;
	}
}

public class compiletimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		advcalc ad = new advcalc();
		System.out.println(ad.add(5, 10));
		System.out.println(ad.add(5, 5, 5));
		System.out.println(ad.add(3.0, 5.0));
		System.out.println(ad.sub(10, 5));
		System.out.println(ad.sub(10, 5, 2));

	}

}
