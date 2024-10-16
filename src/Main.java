import chain.*;
import command.*;
import iterator.Task;
import iterator.TaskList;
import mediator.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        testChain();
//        testTaskIterator();
//        testCommand();
        testMediator();
    }

    public static void testChain() {
        IHandler initial = HandlerFactory.createChain(
                new LowLevelHandler(), new MidLevelHandler(), new HighLevelHandler()
        );

        initial.handle(50, "I think it's low level");
        initial.handle(5, "Very simple task");
        initial.handle(500, "Very hard task");
        initial.handle(1, "Very very simple task");


    }

    public static void testTaskIterator() {
        TaskList taskList = new TaskList();
        taskList.addTask(new Task("Task 1", 1));
        taskList.addTask(new Task("Task 2", 2));
        taskList.addTask(new Task("Task 3", 3));

        Iterator<Task> iterator = taskList.iterator();
        System.out.println("Tasks using while:");
        while (iterator.hasNext()) {
            Task task = iterator.next();
            System.out.println(task);
        }

        System.out.println("Tasks using for each:");
        for (Task task : taskList) {
            System.out.println(task);
        }
    }

    public static void testCommand() {
        String user = "user1";

        ICommand command1 = new PaymentCommand(user, "PayPal");
        ICommand command2 = new NotificationCommand(user, "You have make a payment");
        ICommand command3 = new LogCommand("Payment", "Payment has been made by " + user);

        command1.execute();
        command2.execute();
        command3.execute();

//        or by CommandExecutor
        System.out.println("\nCommandExecutor:");
        CommandExecutor executor = new CommandExecutor();
        executor.executeCommand(command1);
        executor.executeCommands(command2, command3);
    }

    public static void testMediator() {
        TaskNotificationService notificationService = new TaskNotificationService();
        TaskLogService logService = new TaskLogService();

        ITaskMediator mediator = new TaskMediatorImpl(notificationService, logService);
        TaskService taskService = new TaskService(mediator);

        taskService.createTask("1");
        System.out.println();
        taskService.completeTask("1");
    }
}