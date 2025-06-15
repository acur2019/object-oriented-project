import java.util.Scanner;
public class App {
    public static void pritnMenu() {
        /*
         * This method will show the menu of the application.
         * 
         * @return the menu of the application
         */
        System.out.println("Welcome to the Email Application");
        System.out.println("1. Register User");
        System.out.println("2. Login User");
        System.out.println("3. Send Email");
        System.out.println("4. Show Emails");
        System.out.println("5. Exit");
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        do{
            pritnMenu();
            System.out.print("Please select an option: ");
            int option = Integer.parseInt(scanner.nextLine());;
            if (option < 1 || option > 5) {
                System.out.println("Invalid option. Please try again.");
            }}
            else if (option == 1){
                System.out.println("Register User");
                Integer id = 1; // This should be generated automatically in a real application
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your username: ");
                String username = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                new User(id, name, username, password);
            } else if (option == 2) {
                //System.out.println("Login User");
                //this should be implemented to validate the user credentials
                //System.out.print("Enter your username: "); 
                //String username = scanner.nextLine();
                //System.out.print("Enter your password: ");
                //String password = scanner.nextLine();
                //User.login(username, password);
                //The method does not work yet, it should work with more aknowledment adquired in the class
            } else if (option == 3) {
                System.out.println("Send Email");
                String sender = "some";//This should be the logged in user, but for now it is hardcoded
                System.out.println(("Enter the reiceiver's username: "));
                String receiver = scanner.nextLine();
                System.out.println("Enter the subject of the email: ");
                String subject = scanner.nextLine();
                System.out.println("Enter the body of the email: ");
                String body = scanner.nextLine();
                new Email (1,sender, receiver, subject, body);
                //for now the method sendEmail from user is not implemented,it should be implemented in the future
            } else if (option == 4) {
                System.out.println("Show Emails");
                Email.showMessages();
            } else if (option == 5) {
                System.out.println("Exiting...");
                return;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
