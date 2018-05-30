package open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.appointment;

import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.appointment.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface AppointmentRepository extends CrudRepository<Appointment,UUID> {

    List<Appointment> findBySubject(String subject);

    List<Appointment> findByStart(Date start);

}
