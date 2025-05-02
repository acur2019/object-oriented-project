public class User {
    private Integer id;
    public String name;
    public String username;
    private String password;

    public User (Integer id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }
    public boolean register(String name, String username, String password) {
        /*
        * This method will save the information of a user in the database.
        * 
        * @param name: the name of the user
        * @param username: the username of the user
        * @param password: the password of the user
        * 
        * @return a confirmation of the registration
        */
        this.name = name;
        this.username = username;
        this.password = password;
        return true;
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
    public String consult() {
        /*
        * this method should show the information of all the users in the system, their name an their username
        * 
        * @return all the users registered in the system, their name an their username
        */

        //this method should validate if the user is logged in before returning the information, an also show the information of all the users in the system
        return "Name: " + this.name + "\nUsername: " + this.username + "\nPassword: " + this.password;
    }
    public boolean update(Integer id, String newName, String newUsername, String newPassword) {
        /*
        * This method will update the information of a user in the database.
        * 
        * @param id: the id of the user
        * @param newName: the name of the user
        * @param newUsername: the username of the user
        * @param newPassword: the password of the user
        * 
        * @return a confirmation of the update
        */  
        //the id will be used to identify the user in the system in the database
        this.name = newName;
        this.username = newUsername;
        this.password = newPassword;
        return true;
    }
    public boolean sendMessage(String message) {
        /*
        * This method will save the content of a message in the database.
        * 
        * @param message: the message to be sent
        *
        * @return a confirmation of the message sent
        */
        //this method should validate if the user is logged in before sending the message, and take the message from the interface and send it to the database in asociation with a chat
        return true;
    }
    public boolean logout() {
        /*
        * This method will log out the user from the system.
        *
        * @return a confirmation of the logout
        */
        this.username = null;
        this.password = null;
        return true;
    }

}