package iterator;


import java.util.Iterator;

public class TaskList implements Iterable<Task> {
    private Task[] tasks;
    private int size = 0;

    public TaskList() {
        tasks = new Task[10];
    }

    public TaskList(int size) {
        tasks = new Task[size];
    }

    public void addTask(Task task) {
        if (size >= tasks.length / 2) {
            expand();
        }
        tasks[size++] = task;
    }

    public Task get(int index) {
        return tasks[index];
    }

    public int size() {
        return size;
    }

    public Task[] toArray() {
        return tasks;
    }

    private void expand() {
        Task[] newTasks = new Task[size * 2];
        if (size >= 0) System.arraycopy(tasks, 0, newTasks, 0, size);
        tasks = newTasks;
    }

    @Override
    public Iterator<Task> iterator() {
        return new TaskListIterator(this);
    }

    public static class TaskListIterator implements Iterator<Task> {
        private int index = 0;
        private final TaskList taskList;

        public TaskListIterator(TaskList taskList) {
            this.taskList = taskList;
        }

        @Override
        public boolean hasNext() {
            return index < taskList.size();
        }

        @Override
        public Task next() {
            return taskList.get(index++);
        }
    }
}
