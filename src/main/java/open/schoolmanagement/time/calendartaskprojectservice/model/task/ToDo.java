package open.schoolmanagement.time.calendartaskprojectservice.model.task;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ToDo {


    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    Date dueDate;

    @Getter
    @Setter
    String description;

    @Getter
    @Setter
    String reminder;


}
