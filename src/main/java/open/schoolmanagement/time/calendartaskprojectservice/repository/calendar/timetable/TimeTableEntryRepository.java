package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.timetable;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.timetable.TimeTableEntry;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TimeTableEntryRepository extends CrudRepository<TimeTableEntry, UUID> {

}
