package Practice.TaskManager.Model;

public interface Task {

    String getTitle();
    boolean isCompleted();
    void markDone();
    String getDetails(int index);
    Type getType();

}