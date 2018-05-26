package open.schoolmanagement.time.calendartaskprojectservice.model.lending;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import open.schoolmanagement.time.calendartaskprojectservice.model.person.Person;

import java.util.Date;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class LendObject {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String owner;

    @Getter
    @Setter
    private Person ownerOptional;

    @Getter
    @Setter
    private Person lendByWhom;

    @Getter
    @Setter
    private Date whenLend;

    @Getter
    @Setter
    private Date dueToReturn;

    @Getter
    @Setter
    private boolean returned;


}
