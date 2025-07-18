package Practice.TaskManager.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class SimpleTask extends BaseTask {

    public SimpleTask(
        Type type, String title, LocalDate endDate, LocalTime endTime
    ) {
        super(type, title, endDate, endTime);
    }

    @Override
    public String getDetails(int index) {
        String out = "# %d\n   Обычная задача\n   Название: %s\n   Дата оконч" +
            "ания: %02d-%02d-%04d\n   Время окончания: %02d:%02d:%02d\n   Вып" + 
            "олнено: " + (isCompleted() ? "да" : "нет");
        return String.format(
            out,
            index, 
            title, 
            endDate.getDayOfMonth(), 
            endDate.getMonthValue(), 
            endDate.getYear(),
            endTime.getHour(),
            endTime.getMinute(),
            endTime.getSecond()
        );
    }

}