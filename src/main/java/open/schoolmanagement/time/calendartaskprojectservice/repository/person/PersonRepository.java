package open.schoolmanagement.time.calendartaskprojectservice.repository.person;

import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, Long> {
}
