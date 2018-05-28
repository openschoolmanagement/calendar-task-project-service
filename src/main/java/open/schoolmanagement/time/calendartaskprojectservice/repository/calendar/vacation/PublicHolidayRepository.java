package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.vacation;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.vacation.PublicHoliday;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PublicHolidayRepository extends CrudRepository<PublicHoliday, UUID> {
}
