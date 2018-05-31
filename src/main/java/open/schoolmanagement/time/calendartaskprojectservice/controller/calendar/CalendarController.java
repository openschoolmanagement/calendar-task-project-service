package open.schoolmanagement.time.calendartaskprojectservice.controller.calendar;


import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.appointment.Appointment;
import open.schoolmanagement.time.calendartaskprojectservice.service.calendar.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@Controller
@RequestMapping(path = "/calendar")
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @PostMapping(path = "/appointment/add")
    public @ResponseStatus
    Appointment addAppointment(@RequestParam Date start, @RequestParam Date end,
                               @RequestParam String subject, @RequestParam String description) {

        Appointment appointment = calendarService.createAppointment(start, end, subject, description);

        return appointment;
    }



}
