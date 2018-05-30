package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.timetable;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.timetable.TeacherTimeTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherTimeTableRepository extends CrudRepository<TeacherTimeTable, UUID> {
}
