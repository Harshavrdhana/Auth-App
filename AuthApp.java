package KimshukaTech;

public interface AuthApp {
	void registerUser(Register r);
	void editProfile(String name);
	void editProfile(long phoneNO);
	void editProfile1(String email);
	void editProfile2(String password);
	void viewProfile();
	void deactivateProfile();
	void login(int id,String password);
	void login(String email,String password);
	void logout();
}
