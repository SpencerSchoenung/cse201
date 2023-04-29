public class Message {
    private String message;
    private boolean isRead;

    public Message(String message, String sender) {
        this.message = message;
        this.isRead = false;
    }

    public String getMessage() {
        return message;
    }


    public boolean getIsRead() {
        return isRead;
    }

    public void markAsRead() {
        isRead = true;
    }
}