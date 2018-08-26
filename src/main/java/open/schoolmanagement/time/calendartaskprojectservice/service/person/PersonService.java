package open.schoolmanagement.time.calendartaskprojectservice.service.person;

import java.util.Optional;
import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;
import open.schoolmanagement.time.calendartaskprojectservice.repository.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PersonService {


  private PersonRepository personRepository;


  @Autowired
  private PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }


  public Mono<Optional<Person>> findById(Long personId) {
    return Mono.just(personRepository.findById(personId));
  }


}
