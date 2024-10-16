package command;

public class NotificationCommand implements ICommand {
    private final String user;
    private final String message;

    public NotificationCommand(String user, String message) {
        this.user = user;
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Notification sent to user: " + user + ", message: " + message + ".");
    }
}
