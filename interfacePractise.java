package oopsPractise;


interface animal{
	public void type();
	public void pet();
}

interface bird{
	public void habitat();
	public void pet();
}

class dog implements animal, bird{
	
	public void type() {
		System.out.println("Land Animal");
	}
	
	public void pet() {
		System.out.println("It is a pet animal");
	}
	
	public void habitat() {
		System.out.println("It is a omnivore");
	}
	
	public void fly() {
		System.out.println("It can't fly");
	}
}

public class interfacePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d = new dog();
		d.fly();
		d.habitat();
		d.pet();
		d.type();

	}

}
