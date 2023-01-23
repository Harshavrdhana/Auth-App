package KimshukaTech;

public class Register {
	int ID;
	String name;
	Long phoneNo;
	String email;
	String password;
	public Register(int ID,String name, Long phoneNo, String email, String password) {
		super();
		this.ID = ID;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.password = password;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "Register [ID=" + ID + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
}
