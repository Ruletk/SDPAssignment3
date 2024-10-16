import chain.*;
import iterator.Task;
import iterator.TaskList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        testChain();
        testTaskIterator();
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
}