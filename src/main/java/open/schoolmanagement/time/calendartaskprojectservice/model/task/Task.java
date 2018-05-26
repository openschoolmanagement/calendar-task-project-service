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
    private String id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private Date deadline;
    @Getter
    @Setter
    private Date started;
    @Getter
    @Setter
    private Date reminder;
    @Getter
    @Setter
    private Person taskGiver;
    @Getter
    @Setter
    private Person taskExecutor;

    Task() {

    }

}
