package KimshukaTech;
import java.util.LinkedList;

public class UsersDataBase implements AuthApp{
	boolean login=false;
	LinkedList<Register> usersList=new LinkedList<Register>();
	public void registerUser(Register r) {
		usersList.add(r);
	}
	Register foundAcc=null;
	public void login(int id,String password){
		boolean accFound=false;
		for(Register reg:usersList) {
			
			if(usersList.size()!=0&&reg.getID()==id&&reg.getPassword()==password) {
				foundAcc=reg;
				login =true;
				System.out.println("Login successful");
				accFound=true;
				break;
			}
			else if(usersList.size()!=0&&reg.getID()==id&&reg.getPassword()!=password) {
				System.out.println("incorrect password. re-enter password");
				accFound=true;
				break;
			}
		}
		if(!accFound) {
			System.out.println("User not found create new account");
		}
	}
	public void login(String email,String password) {
		boolean accFound=false;
		for(int i=0;i<usersList.size();i++) {
			Register reg=usersList.get(i);
			System.out.println(reg);
			System.out.println(reg.getEmail()+"\n"+reg.getPassword()+"\n"+email+"\n"+password);
			if(reg.getEmail()==email&&reg.getPassword()==password) {
				foundAcc=reg;
				login =true;
				accFound=true;
				System.out.println("Login successful");
				break;
			}
			else if(reg.getEmail()==email&&reg.getPassword()!=password) {
				System.out.println("incorrect password.re-enter password");
				accFound=true;
				break;
			}
		}
		if(!accFound) {
			System.out.println("User not found create new account");
		}
	}
	public void viewProfile() {
		System.out.println(foundAcc);
	}

	public void editProfile(String name) {
		foundAcc.setName(name);
	}
	public void editProfile(long phoneNO) {
		foundAcc.setPhoneNo(null);
		
	}
	public void editProfile1(String email) {
		foundAcc.setEmail(email);
	}
	public void editProfile2(String password) {
		foundAcc.setPassword(password);
	}
	public void logout() {
		login=false;
	}
	public void deactivateProfile() {
		usersList.remove(foundAcc);
	}
}
