

/**
 * Represents a User in the application.
 * This is a simple data class (POJO) to hold user information.
 * All logic for managing lists of users is handled by the App class.
 */
public class User {
    private Integer id;
    private String name;
    private String username;
    private String password;

    /**
     * Constructor to create a new User.
     * @param id The user's unique ID.
     * @param name The user's full name.
     * @param username The user's username for login.
     * @param password The user's password for login.
     */
    public User(Integer id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }
    public boolean login(String username, String password) {
        /*
        * This confirms the user exists, and if the credentials ingresed are correct.
        * 
        * @param username: the username of the user
        * @param password: the password of the user
        * 
        * @return a confirmation of the login, in case the information is correct, otherwise false
        */
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    
    // --- Getters ---
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

}