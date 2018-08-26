package open.schoolmanagement.time.calendartaskprojectservice.service.person;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;
import open.schoolmanagement.time.calendartaskprojectservice.repository.person.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class PersonServiceTest {


  private PersonService personService;

  @Mock
  private PersonRepository personRepository;

  private Person testPerson;


  @Before
  public void setUp() throws Exception {
    personService = new PersonService();
    testPerson = Person.;
  }

  @Test
  public void findPersonByIdTest() {





    when(personRepository.findById(any())).thenReturn(null);


  }
}
