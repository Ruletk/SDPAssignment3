package mediator;

public class TaskNotificationService {
    public void sendTaskCreatedNotification(String taskId) {
        System.out.println("Notification: Task created with id: " + taskId);
    }

    public void sendTaskCompletedNotification(String taskId) {
        System.out.println("Notification: Task completed with id: " + taskId);
    }
}
