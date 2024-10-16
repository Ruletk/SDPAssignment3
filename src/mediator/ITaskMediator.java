package mediator;

public interface ITaskMediator {
    void notify(Object sender, String event, String taskId);
}
