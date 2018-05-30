package open.schoolmanagement.time.calendartaskprojectservice.repository.classes;

import open.schoolmanagement.time.calendartaskprojectservice.domain.classes.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherRepository extends CrudRepository<Teacher, UUID> {
}
