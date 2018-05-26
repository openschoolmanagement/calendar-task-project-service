package open.schoolmanagement.time.calendartaskprojectservice.model.person;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Person {

    @Getter
    @Setter
    private String emailAddress; //ID

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;


}
