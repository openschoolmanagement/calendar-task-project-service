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
    private String id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String Description;
    @Getter
    @Setter
    private Person responsible;
    @Getter
    @Setter
    private Date start;
    @Getter
    @Setter
    private Date end;

    @Getter
    @Setter
    private List<ProjectTask> projectTasks;

}
