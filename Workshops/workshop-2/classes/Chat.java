public class Chat {
    private Integer id;
    private String messages;

    public boolean create(String messages) {
        /* 
         * This method will create a new chat in the database.
         * 
         * @param messages: the messages of the chat
         * 
         * @return a confirmation of the creation
         */
        this.messages = messages;
        return true;
    }   
    public String consult() {
        /* 
         * This method will show the messages of a chat.
         * 
         * @return the messages of the chat
         */
        //this method should validate if the user is logged in before returning the information, an also show the information of all the messages in the system
        return this.messages;
    }
    public boolean cleanChat(Integer id) {
        /* 
         * This method will delete a chat in the database.
         * 
         * @param id: the id of the chat
         * 
         * @return a confirmation of the deletion
         */
        //this method should validate the id of the chat in the system in the database, and if the user is logged in before cleaning the chat
        this.messages = null;
        return true;
    }
}
