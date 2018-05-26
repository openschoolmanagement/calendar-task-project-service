package open.schoolmanagement.time.calendartaskprojectservice.model.person;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Person {

    @Getter
    @Setter
    String emailAddress;

    @Getter
    @Setter
    String firstName;

    @Getter
    @Setter
    String lastName;




}
