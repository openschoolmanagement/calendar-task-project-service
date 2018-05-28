package open.schoolmanagement.time.calendartaskprojectservice.repository.person;

import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PersonRepository extends CrudRepository<Person, UUID> {

}
