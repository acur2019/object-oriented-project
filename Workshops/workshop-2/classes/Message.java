
public class Message {
        private Integer id;
    private String content;
    private File file;//the message is suposed to support files.

    public boolean create(String content, File file) {
        /* 
         * This method will create a new message in the database.
         * 
         * @param content: the content of the message
         * @param file: the file attached to the message
         * 
         * @return a confirmation of the creation
         */
        this.content = content;
        this.file = file;
        return true;
    }
    public boolean consult() {
        /* 
         * This method will show the content of a message.
         * 
         * @return the content of the message
         */
        //this method should validate if the user is logged in before returning the information, an also show the information of all the messages in the system
        return this.content;
    }
    public boolean update(Integer id, String newContent, File newFile) {
        /* 
         * This method will update the content of a message in the database.
         * 
         * @param id: the id of the message
         * @param newContent: the new content of the message
         * @param newFile: the new file attached to the message
         * 
         * @return a confirmation of the update
         */
        //the id will be used to identify the message in the system in the database
        this.content = newContent;
        this.file = newFile;
        return true;
    }
}
