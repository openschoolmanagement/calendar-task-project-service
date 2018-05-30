package open.schoolmanagement.time.calendartaskprojectservice.repository.project;

import open.schoolmanagement.time.calendartaskprojectservice.domain.project.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProjectRepository extends CrudRepository<Project, UUID> {

}
