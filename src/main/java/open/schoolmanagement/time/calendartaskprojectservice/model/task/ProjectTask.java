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
    private String id;

    @Getter
    @Setter
    private Project project;

    @Getter
    @Setter
    private ProjectTask predecessor;

    @Getter
    @Setter
    private List<ProjectTask> successor;
}
