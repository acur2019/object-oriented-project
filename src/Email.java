import java.util.List;

public class Email { 
    private Integer id = 1;
    private String sender;
    private String receiver;
    private String subject;
    private String body;
    private List<Email> emails = null;

    public Email(Integer id, String sender, String receiver, String subject, String body) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    public String showMessages() {
        String messagesPrint = null;
        /* 
         * This method will show the messages in the chat.
         * 
         * @param id: the identifier of the chat
         * 
         * @return mesagges in the chat
         */
        //The system will validate wich are the users in the system
        if (this.emails.isEmpty()) 
            return  "No emails registered in the system." ;
        for (Email email : this.emails) {
            if (email.receiver == this.sender){
                messagesPrint = email.id + " " + email.sender + " " + email.receiver + " " + email.subject + " " + email.body;
                return messagesPrint;
            }
        }
        return "Error";
    }   
    
}
