package open.schoolmanagement.time.calendartaskprojectservice.repository.lending;

import open.schoolmanagement.time.calendartaskprojectservice.domain.lending.LendObject;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface LendingObjectRepository extends CrudRepository<LendObject, UUID> {

}
