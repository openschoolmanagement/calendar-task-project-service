package open.schoolmanagement.time.calendartaskprojectservice.model.project;

import lombok.Getter;
import lombok.Setter;
import open.schoolmanagement.time.calendartaskprojectservice.model.person.Person;
import open.schoolmanagement.time.calendartaskprojectservice.model.task.ProjectTask;

import java.util.Date;
import java.util.List;

public class Project {

    @Getter
    @Setter
    String id;
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    String Description;
    @Getter
    @Setter
    Person responsible;
    @Getter
    @Setter
    Date start;
    @Getter
    @Setter
    Date end;

    @Getter
    @Setter
    List<ProjectTask> projectTasks;

}
