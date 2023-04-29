import java.util.ArrayList;

public class Notification {
    private ArrayList<Notification> notifications;

    public Notification() {
        notifications = new ArrayList<Notification>();
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public void removeNotification(Notification notification) {
        notifications.remove(notification);
    }

    public ArrayList<Notification> getNotifications() {
        return notifications;
    }
}
