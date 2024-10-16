package command;

public class LogCommand implements ICommand {
    private final String event;
    private final String message;

    public LogCommand(String event, String message) {
        this.event = event;
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Log has been created for event: " + event + ", message: " + message + ".");
    }
}
