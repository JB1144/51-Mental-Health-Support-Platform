import java.util.HashMap;
import java.util.Scanner;

public class UserLogin {
    private static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        // Pre-populate some user accounts
        users.put("Saniya", "saniya@123");
        users.put("Bhargavee", "jb@123");
        users.put("Vaibhavi", "vaibhavi@123");

        Scanner scanner = new Scanner(System.in);

        while (true) {
	    System.out.println("      WELCOME TO THE MENTAL HEALTH SUPPORT PLATFORM.");
	    System.out.println("IF IT COSTS YOUR HAPPINESS GATHER YOUR STRENGTH AND LET IT GO...");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (login(username, password)) {
                System.out.println("Login successful!");
                while(true) {
                    // Display menu options
                    displayMenu();

                    // Get user's choice
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    // Process user's choice
                    switch (choice) {
                        case 1:
                            // Option 1
                            Assessment.main(null);
                            break;
                        case 2:
                            // Option 2
                            ResourceRecommendation.main(null);
                            break;
                        case 3:
                            // Option 3
                            MentalHealthLinkedList.main(null);
                            break;
                        case 4:
                            // Option 4
                            ScheduleAppointment.main(null);
                            break;
                        case 5:
                            // Option 5
                            ProgressTracking.main(null);
                            break;
			case 6:
                            // Option 6
                            MoodGames.main(null);
                            break;
                        case 7:
                            System.out.println("THANK YOU !!!! VISIT AGAIN");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                    }
                }
            } else {
                System.out.println("Invalid username or password.");
                System.out.println("If you already have an account, check if the password you entered is correct.");
                System.out.print("Do you want to create a new account? (yes/no): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("yes")) {
                    createUserAccount(username, password);
                    System.out.println("Account created successfully!");
                }
            }
        }
    }

    private static boolean login(String username, String password) {
        // Check if username exists and password matches
        return users.containsKey(username) && users.get(username).equals(password);
    }

    private static void createUserAccount(String username, String password) {
        // Add the new user to the list of existing users
        users.put(username, password);
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Give a quick test to track your mental health score.");
        System.out.println("2. Some Recommended Resources for you.");
        System.out.println("3. Know about different mental health disorders here!..");
        System.out.println("4. Schedule an appointment with Trusted Therapists.");
        System.out.println("5. Track your progress!!!..");
	System.out.println("6. Enlighten your mood by playing some fun games !!..");
        System.out.println("7. Exit.");
        System.out.print("Enter your choice: ");
    }
}
