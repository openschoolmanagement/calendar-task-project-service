package open.schoolmanagement.time.calendartaskprojectservice.repository.project;

import open.schoolmanagement.time.calendartaskprojectservice.domain.project.ProjectTask;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProjectTaskRepository extends CrudRepository<ProjectTask,UUID> {

}
