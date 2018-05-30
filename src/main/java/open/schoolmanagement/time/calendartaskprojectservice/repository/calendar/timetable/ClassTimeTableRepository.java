package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.timetable;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.timetable.ClassTimeTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ClassTimeTableRepository extends CrudRepository<ClassTimeTable, UUID> {

}
