package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.vacation;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.vacation.Vacation;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface VacationRepository extends CrudRepository<Vacation, UUID> {
}
