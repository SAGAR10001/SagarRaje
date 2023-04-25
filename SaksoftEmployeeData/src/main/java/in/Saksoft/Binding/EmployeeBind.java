package in.Saksoft.Binding;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class EmployeeBind {
	
	@Id
	private int empId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String eMail;
	
	@Column(name = "age")
	private int age;

	public EmployeeBind() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeBind(int empId, String firstName, String lastName, String eMail, int age) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeBind [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", eMail="
				+ eMail + ", age=" + age + "]";
	}
	
	
}
