public class Student {
	String name, address, phone, email ;
	public Student(String name) {
		this.name=name;
	}
	public Student(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return name + " " + address + " "+ phone + " " + email;
	}
	
}
