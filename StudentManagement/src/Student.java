import java.io.Serializable;

/**
 * @author Tan
 * @description For save Student's information
 * @email ndtan.hcm @ gmail.com.vn
 */
public class Student implements Serializable {
	private int id;
	private String name;
	private int age;
	private String address;
	private float gpa;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int age, String address, float gpa) {
		super();// call constructor of serializable
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
}
