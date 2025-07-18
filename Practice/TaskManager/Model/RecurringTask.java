package Practice.TaskManager.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class RecurringTask extends BaseTask {

    int interval;
    LocalTime repeatTime;

    public RecurringTask(
        Type type, 
        String title, 
        int interval, 
        LocalTime repeatTime, 
        LocalDate endDate, 
        LocalTime endTime
    ) {
        super(type, title, endDate, endTime);
        this.interval = interval;
        this.repeatTime = repeatTime;
    }

    @Override
    public String getDetails(int index) {
        String out = "# %d\n   Повторяющаяся задача\n   Название: %s\n   Инте" + 
            "рвал: %d\n   Время повторения: %02d:%02d:%02d\n   Дата окончания" + 
            ": %02d-%02d-%04d\n   Время окончания: %02d:%02d:%02d\n   Выполне" + 
            "но: " + (isCompleted() ? "да" : "нет");
        return String.format(
            out,
            index, 
            title, 
            interval,
            repeatTime.getHour(),
            repeatTime.getMinute(),
            repeatTime.getSecond(),
            endDate.getDayOfMonth(), 
            endDate.getMonthValue(), 
            endDate.getYear(),
            endTime.getHour(),
            endTime.getMinute(),
            endTime.getSecond()
        );
    }

}