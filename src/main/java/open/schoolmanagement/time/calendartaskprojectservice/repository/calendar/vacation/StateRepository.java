package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.vacation;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.vacation.State;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface StateRepository extends CrudRepository<State, UUID> {
}
