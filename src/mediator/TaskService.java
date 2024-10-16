package mediator;

public class TaskService {
    private final ITaskMediator mediator;

    public TaskService(ITaskMediator mediator) {
        this.mediator = mediator;
    }

    public void createTask(String taskId) {
        System.out.println("Task created with id: " + taskId + ".");
        mediator.notify(this, "taskCreated", taskId);
    }

    public void completeTask(String taskId) {
        System.out.println("Task completed with id: " + taskId + ".");
        mediator.notify(this, "taskCompleted", taskId);
    }
}
