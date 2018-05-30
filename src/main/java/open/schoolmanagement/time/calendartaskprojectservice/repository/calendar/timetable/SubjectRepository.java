package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.timetable;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.timetable.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SubjectRepository extends CrudRepository<Subject, UUID> {
}
