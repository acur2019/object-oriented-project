/**
 * Represents a single Email message.
 * This class acts as a data container for email properties.
 * The logic for managing a collection of emails is handled in the App class.
 */
public class Email {
    private Integer id;
    private String sender;
    private String receiver;
    private String subject;
    private String body;

    /**
     * Constructor for creating a new Email object.
     * @param id The unique identifier for the email.
     * @param sender The username of the sender.
     * @param receiver The username of the receiver.
     * @param subject The subject line of the email.
     * @param body The main content of the email.
     */
    public Email(Integer id, String sender, String receiver, String subject, String body) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }

    /**
     * Overrides the default toString() method to provide a clean,
     * readable representation of the email's contents.
     * This is used by the App class to display the emails.
     * @return A formatted string with the email details.
     */
    @Override
    public String toString() {
        return "-----------------------------------\n" +
               "ID: " + id + "\n" +
               "From: " + sender + "\n" +
               "To: " + receiver + "\n" +
               "Subject: " + subject + "\n" +
               "Body: " + body + "\n" +
               "-----------------------------------";
    }

    // --- Getters ---
    public Integer getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}
