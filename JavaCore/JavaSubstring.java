package JavaCore;

import java.util.Scanner;

public class JavaSubstring {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if (email.indexOf("@") != email.lastIndexOf("@") || !email.contains("@")) {
            System.out.println("Failed: Wrong email");
            scanner.close();
        } else {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Hello!\nUsername: " + username + "\nDomain: " + domain);
        }

        scanner.close();
        
    }  

}