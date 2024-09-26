package oopsPractise;

class Bank {

	public double getRateofInterest() {
		return 5;
	}
}

class SBI extends Bank {

	public double getRateofInterest() {
		return 7.5;
	}
}

class ICICI extends Bank {

	public double getRateofInterest() {
		return 8.5;
	}
}

public class runTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI sb = new SBI();
		ICICI ic = new ICICI();

		System.out.println(sb.getRateofInterest());
		System.out.println(ic.getRateofInterest());

	}

}
