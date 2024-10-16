package mediator;

public class TaskMediatorImpl implements ITaskMediator {
    private final TaskNotificationService taskNotificationService;
    private final TaskLogService taskLogService;

    public TaskMediatorImpl(TaskNotificationService taskNotificationService, TaskLogService taskLogService) {
        this.taskNotificationService = taskNotificationService;
        this.taskLogService = taskLogService;
    }

    @Override
    public void notify(Object sender, String event, String taskId) {
        if (sender instanceof TaskService) {
            if (event.equals("taskCreated")) {
                System.out.println("Mediator received notification: Task created.");
                taskNotificationService.sendTaskCreatedNotification(taskId);
                taskLogService.logTaskCreated("Task created.");
            } else if (event.equals("taskCompleted")) {
                System.out.println("Mediator received notification: Task completed.");
                taskNotificationService.sendTaskCompletedNotification(taskId);
                taskLogService.logTaskCompleted("Task completed.");
            }
        }
    }
}
