package open.schoolmanagement.time.calendartaskprojectservice.service.person;

import java.util.Optional;
import java.util.concurrent.Callable;
import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;
import open.schoolmanagement.time.calendartaskprojectservice.repository.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

@Service
public class PersonService {


  private PersonRepository personRepository;

  @Qualifier("jdbcScheduler")
  @Autowired
  private Scheduler scheduler;

  public Mono<Optional<Person>> findById(Long personId) {
    return async(() -> personRepository.findById(personId));
  }


  private <T> Mono<T> async(Callable<T> callable) {
    return Mono.fromCallable(callable).publishOn(scheduler);
  }

}
