package klef.LabExam;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String displayEmployee() {
		return id+" "+name;
	}
}
