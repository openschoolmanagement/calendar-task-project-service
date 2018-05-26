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
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Date dueDate;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private String reminder;


}
