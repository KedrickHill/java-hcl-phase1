import java.util.List;

public class Email {
    private String from;
    private List<String> recipients;
    private String message;

    public Email(String from, List<String> recipients, String message) {
        this.from = from;
        this.recipients = recipients;
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getRecipients() {git
        return recipients;
    }

    public void setTo(List<String> recipients) {
        this.recipients = recipients;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}
