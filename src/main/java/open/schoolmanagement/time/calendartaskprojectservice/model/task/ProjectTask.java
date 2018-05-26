package open.schoolmanagement.time.calendartaskprojectservice.model.task;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import open.schoolmanagement.time.calendartaskprojectservice.model.project.Project;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ProjectTask extends Task {

    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    Project project;

    @Getter
    @Setter
    ProjectTask predecessor;

    @Getter
    @Setter
    List<ProjectTask> successor;
}
