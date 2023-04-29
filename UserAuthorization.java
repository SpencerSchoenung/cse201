import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserAuthorization {
	
	

	public boolean Authenticate(String username, String password) {
        String filename = "Users.txt";
        String User = "";
        String pass = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            User = br.readLine();
            pass = br.readLine();
        } catch (IOException e) {
            System.out.println("Error No File");
        }


        if (User.equals(username) && pass.equals(password)) {
            System.out.println("Successful Login");
            return true;
        } else {
            System.out.println("Username or password is incorrect");
            return false;
        }
	}
    
}