package open.schoolmanagement.time.calendartaskprojectservice.service.person;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;
import open.schoolmanagement.time.calendartaskprojectservice.CalendarTaskProjectServiceApplication;
import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;
import open.schoolmanagement.time.calendartaskprojectservice.repository.person.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalendarTaskProjectServiceApplication.class)
public class PersonServiceTest {

  @Autowired
  private PersonService personService;

  @Mock
  private PersonRepository personRepository;

  private Person testPerson;
  private Long expectedPersonID = new Long(1234);
  private Long expectedContactID = new Long(5678);
  private String expectedFirstName = "Karl";
  private String expectedLastName = "Valentin";


  @Before
  public void setUp() throws Exception {

    testPerson =
        Person.builder()
            .personId(expectedPersonID)
            .contactId(expectedContactID)
            .firstName(expectedFirstName)
            .lastName(expectedLastName)
            .build();

  }

  @Test
  public void findPersonByIdTest() {
    when(personRepository.findById(any())).thenReturn(Optional.of(testPerson));
    assertThat(personService).isNotNull();
    assertThat(personService.findById(new Long(1234)).block()).isEqualTo(testPerson);
  }
}
