package open.schoolmanagement.time.calendartaskprojectservice.repository.classes;

import open.schoolmanagement.time.calendartaskprojectservice.domain.classes.SchoolClass;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SchoolClassRepository extends CrudRepository<SchoolClass, UUID> {

}
