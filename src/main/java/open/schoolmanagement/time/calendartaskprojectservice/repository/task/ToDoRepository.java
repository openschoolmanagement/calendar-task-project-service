package open.schoolmanagement.time.calendartaskprojectservice.repository.task;

import open.schoolmanagement.time.calendartaskprojectservice.domain.task.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ToDoRepository extends CrudRepository<ToDo, UUID> {
}
