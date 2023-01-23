package KimshukaTech;

public class RegisterAccount {
		private int random = 1001 ;
	Register createAccount(String name,Long phoneNo,String email,String password) {
		Register r1=new Register(random++,name,phoneNo,email,password);
		return r1;
	}
}
