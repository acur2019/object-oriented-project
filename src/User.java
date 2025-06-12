public interface User {

    public abstract Boolean register();

    public abstract Boolean login();

    public abstract String searchUsers();

    public abstract Boolean update();
    
    public abstract Boolean sendMessage();

    public abstract Boolean readMessage();

    public abstract Boolean logout();

}