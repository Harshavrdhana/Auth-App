package KimshukaTech;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		UsersDataBase uDB=new UsersDataBase();
		RegisterAccount ra=new RegisterAccount();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 Register");
			System.out.println("Enter 2 login");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Username");
				String name=sc.next();
				System.out.println("Enter Phone number");
				long phoneNo =sc.nextLong();
				System.out.println("Enter Email ID");
				String email=sc.next();
				System.out.println("Enter password");
				String password=sc.next();
				Register r=ra.createAccount(name,phoneNo,email,password);
				uDB.registerUser(r);
				break;
				
			case 2:
				while(!uDB.login) {
					System.out.println("Enter 1 to UserID login");
					System.out.println("Enter 2 email address login");
					int choice1=sc.nextInt();
					switch(choice1) {
					case 1:
						System.out.println("Enter UserID" );
						int ID=sc.nextInt();
						System.out.println("Enter password");
						String password1=sc.next();
						uDB.login(ID, password1);
						break;
					case 2:
						System.out.println("Enter email address" );
						String email1=sc.next();
						System.out.println("Enter password");
						String password2=sc.next();
						uDB.login(email1, password2);
						break;
					default:
						System.out.println("Enter valid choice");
						break;
					}
				}
				while(uDB.login) {
					System.out.println("Enter 1 to view profile");
					System.out.println("Enter 2 to edit profile");
					System.out.println("Enter 3 to deactivate profile");
					System.out.println("Enter 4 to logout");
					int choice3=sc.nextInt();
					switch(choice3) {
					case 1:
						uDB.viewProfile();
						break;
					case 2:
						System.out.println("Enter 1 to change the name");
						System.out.println("Enter 2 to change the Phone number");
						System.out.println("Enter 3 to change the email");
						System.out.println("Enter 4 to change the password");
						int choice4=sc.nextInt();
						switch(choice4) {
						case 1:
							System.out.println("Enter new Username");
							String name1=sc.next();
							uDB.editProfile(name1);
							break;
						case 2:
							System.out.println("Enter new Phone number");
							long phoneNo1=sc.nextLong();
							uDB.editProfile(phoneNo1);
							break;
						case 3:
							System.out.println("Enter new email address");
							String email2=sc.next();
							uDB.editProfile1(email2);
							break;
						case 4:
							System.out.println("Enter new password");
							String password21=sc.next();
							uDB.editProfile2(password21);
							break;
						default:
							System.out.println("Enter valid choice");
							break;
						}
					case 3:
						uDB.deactivateProfile();
						break;
					case 4:
						uDB.logout();
						break;
					default:
						System.out.println("Enter valid choice");
						break;
					}
				}
			default:
				System.out.println("Enter valid choice");
				break;
			}
		}
	}
}
