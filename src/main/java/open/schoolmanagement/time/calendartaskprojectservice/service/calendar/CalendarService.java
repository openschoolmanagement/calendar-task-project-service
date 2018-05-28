package open.schoolmanagement.time.calendartaskprojectservice.service.calendar;


import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.appointment.Appointment;
import open.schoolmanagement.time.calendartaskprojectservice.repository.calendar.appointment.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CalendarService {


    @Autowired
    AppointmentRepository appointmentRepository;


    public Appointment createAppointment(Date start, Date end, String subject, String description) {

        long duration = end.getTime() - start.getTime();

        Appointment appointment = Appointment.builder().
                start(start).end(end).duration(duration).
                subject(subject).description(description).for_whom(null).build(); //TODO Create Person out of current principal

        appointment = appointmentRepository.<Appointment>save(appointment);

        return appointment;
    }
}
