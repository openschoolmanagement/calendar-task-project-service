package open.schoolmanagement.time.calendartaskprojectservice.model.task;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import open.schoolmanagement.time.calendartaskprojectservice.model.person.Person;

import java.util.Date;
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Task {

    @Getter
    @Setter
    String id;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    String description;
    @Getter
    @Setter
    Date deadline;
    @Getter
    @Setter
    Date started;
    @Getter
    @Setter
    Date reminder;
    @Getter
    @Setter
    Person taskGiver;
    @Getter
    @Setter
    Person taskExecutor;

    Task(){

    }

}
