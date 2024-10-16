package mediator;

public class TaskLogService {
    public void logTaskCreated(String taskId) {
        System.out.println("Log: Task created with id: " + taskId);
    }

    public void logTaskCompleted(String taskId) {
        System.out.println("Log: Task completed with id: " + taskId);
    }
}
