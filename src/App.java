import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class App {

    /**
     * This method will show the menu of the application.
     */
    public static void printMenu() {
        System.out.println("\n--- Welcome to the Email Application ---");
        System.out.println("1. Register User");
        System.out.println("2. Login User (Not Implemented)");
        System.out.println("3. Send Email");
        System.out.println("4. Show All Emails");
        System.out.println("6. Show All Users");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Email> emails = new ArrayList<>();
        int nextUserId = 1;
        int nextEmailId = 1;
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Email Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            JButton registerButton = new JButton("Register User");
            registerButton.addActionListener(e -> {
                String name = JOptionPane.showInputDialog(frame, "Enter your name:");
                String username = JOptionPane.showInputDialog(frame, "Enter your username:");  
                String password = JOptionPane.showInputDialog(frame, "Enter your password:");
                if (name != null && username != null && password != null) {
                    try{
                        // Create a new user and add it to the central list.
                        User newUser = new User(1, name, username, password);
                        users.add(newUser);
                        JOptionPane.showMessageDialog(frame, "User '" + username + "' registered successfully!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(frame, "Error registering user");
                    }
                    
                }
                
            
            });
            JButton loginButton = new JButton("Login User (Not Implemented)");
            loginButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, "This feature is not yet implemented.");
            });

            JButton sendEmailButton = new JButton("Send Email");
            sendEmailButton.addActionListener(e -> {
                String sender = JOptionPane.showInputDialog(frame, "Enter the sender's username:");
                String receiver = JOptionPane.showInputDialog(frame, "Enter the receiver's username:");
                String subject = JOptionPane.showInputDialog(frame, "Enter the subject of the email:");
                String body = JOptionPane.showInputDialog(frame, "Enter the body of the email:");
                if (sender != null && receiver != null && subject != null && body != null) {
                    try {
                        // Create a new email and add it to the central list.
                        Email newEmail = new Email(1, sender, receiver, subject, body);
                        emails.add(newEmail);
                        JOptionPane.showMessageDialog(frame, "Email sent successfully!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(frame, "Error sending email");
                    }
                }
            });

            JButton showEmailsButton = new JButton("Show All Emails");
            showEmailsButton.addActionListener(e -> {
                if (emails.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "There are no emails to show.");
                } else {
                    StringBuilder emailList = new StringBuilder("Emails:\n");
                    for (Email email : emails) {
                        emailList.append(email.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(frame, emailList.toString());
                }
            });
            JButton showUsersButton = new JButton("Show All Users");
            showUsersButton.addActionListener(e -> {
                if (users.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "There are no registered users.");
                } else {
                    StringBuilder userList = new StringBuilder("Users:\n");
                    for (User user : users) {
                        userList.append("ID: ").append(user.getId())
                                .append(", Name: ").append(user.getName())
                                .append(", Username: ").append(user.getUsername()).append("\n");
                    }
                    JOptionPane.showMessageDialog(frame, userList.toString());
                }
            });
            JButton exitButton = new JButton("Exit");
            exitButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, "Exiting application...");
                System.exit(0); // Exit the application.
            });
            panel.add(registerButton);
            panel.add(loginButton); 
            panel.add(sendEmailButton);
            panel.add(showEmailsButton);
            panel.add(showUsersButton);
            panel.add(exitButton);
            frame.add(panel);
            frame.setVisible(true);

        });

       
    }
}
