package Practice.TaskManager.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class ImportantTask extends BaseTask {

    int priority;

    public ImportantTask(
        Type type, 
        String title, 
        int priority, 
        LocalDate endDate, 
        LocalTime endTime
    ) {
        super(type, title, endDate, endTime);
        this.priority = priority;
    }

    @Override
    public String getDetails(int index) {
        String out = "# %d\n   Важная задача\n   Название: %s\n   Приоритет: " + 
            "%03d/100\n   Дата окончания: %02d-%02d-%04d\n   Время окончания:" + 
            "%02d:%02d:%02d\n   Выполнено: " + (isCompleted() ? "да" : "нет");
        return String.format(
            out,
            index, 
            title, 
            priority,
            endDate.getDayOfMonth(), 
            endDate.getMonthValue(), 
            endDate.getYear(),
            endTime.getHour(),
            endTime.getMinute(),
            endTime.getSecond()
        );
    }

}