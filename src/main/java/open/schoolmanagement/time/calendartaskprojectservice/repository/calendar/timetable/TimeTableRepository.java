package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.timetable;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.timetable.TimeTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TimeTableRepository extends CrudRepository<TimeTable, UUID> {

}
