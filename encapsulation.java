package oopsPractise;

class employee {
	
	private int salary;
	private int id;
	
	public int getSalary() {
		return salary;
	}
	
	public int getId() {	
		return id;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}


public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee emp = new employee();
		emp.setId(5);
		emp.setSalary(15000);
		System.out.println(emp.getSalary());
		System.out.println(emp.getId());
	}

}
