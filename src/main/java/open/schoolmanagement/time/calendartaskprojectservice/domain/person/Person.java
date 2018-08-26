package open.schoolmanagement.time.calendartaskprojectservice.domain.person;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name = "person")
public class Person {

  @Id
  @GeneratedValue
  @Column(name = "person_id", nullable = false)
  private Long personId;

  @Column(name = "emailaddress")
  private String firstName;

  @Column(name = "lastname")
  private String lastName;

  @Column(name = "contactid")
  private Long contactId;


}
