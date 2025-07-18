package Practice.TaskManager.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class BaseTask implements Task {

    protected String title;
    protected boolean completed;
    protected Type type;
    protected LocalDate endDate;
    protected LocalTime endTime;

    BaseTask(Type type, String title, LocalDate endDate, LocalTime endTime) {
        this.title = title;
        this.completed = false;
        this.type = type;
        this.endDate = endDate;
        this.endTime = endTime;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean isCompleted() {
        return this.completed;
    }

    @Override
    public void markDone() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return title + " : " + ((completed) ? "выполнено" : "НЕ выполнено");
    }

    @Override
    public Type getType() {
        return this.type;
    }

}