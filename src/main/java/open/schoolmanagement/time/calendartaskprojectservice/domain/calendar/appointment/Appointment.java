package open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.appointment;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Table(name = "appointment")
@Builder
public class Appointment {


    @Getter
    @Id
    @GeneratedValue
    private UUID id;
    @Getter
    @Column(name = "start")
    private Date start;
    @Getter
    @Column(name = "end")
    private Date end;
    @Getter
    @Column(name = "duration")
    private long duration;
    @Getter
    @Column(name = "subject")
    private String subject;
    @Getter
    @Column(name = "description")
    private String description;

}
