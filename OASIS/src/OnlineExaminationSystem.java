import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String inputPassword) {
        return password.equals(inputPassword);
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public String getUsername() {
        return username;
    }
}

class Exam {

	public void startExam(User user) {
		// TODO Auto-generated method stub
		
	}
    // (Unchanged from your original code)
}

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        User user = new User("username", "password"); // Initialize with actual username and password
        Exam exam = new Exam(
        );

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (user.authenticate(password) && username.equals(user.getUsername())) {
            boolean loggedIn = true;
            while (loggedIn) {
                System.out.println("\n1. Start Exam");
                System.out.println("2. Update Profile");
                System.out.println("3. Change Password");
                System.out.println("4. Logout");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        exam.startExam(user);
                        break;
                    case 2:
                        // Implement profile update logic
                        break;
                    case 3:
                        System.out.print("Enter new password: ");
                        String newPassword = scanner.next();
                        user.changePassword(newPassword);
                        System.out.println("Password updated successfully.");
                        break;
                    case 4:
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid username or password. Exiting...");
        }

        scanner.close();
    }
}
