package open.schoolmanagement.time.calendartaskprojectservice.repository.task;

import open.schoolmanagement.time.calendartaskprojectservice.domain.task.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TaskRepository extends CrudRepository<Task, UUID> {
}
