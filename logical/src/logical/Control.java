package logical;
import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner (System.in);
		String correctusername ="yahaya";
		String correctpassword = "256";
		
		System.out.println("Enter your username");
		
		String username = Scanner.nextLine();
		
		System.out.println("Enter your password");
		
		String password = Scanner.nextLine();
		if (username.equals(correctusername) && password.equals(correctpassword))
		{System.out.println("Login Sucessful"); 
		}else {
			System.out.println("Login failed! please check your username and password");}
		
		
		 
		
		
		
	
				
		

	}

}
