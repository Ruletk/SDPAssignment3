package command;

public class CommandExecutor {
    public void executeCommand(ICommand command) {
        command.execute();
    }

    public void executeCommands(ICommand... commands) {
        for (ICommand command : commands) {
            executeCommand(command);
        }
    }
}
