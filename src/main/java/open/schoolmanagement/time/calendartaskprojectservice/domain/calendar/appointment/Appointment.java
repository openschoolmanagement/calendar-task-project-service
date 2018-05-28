package open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.appointment;

import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Table(name = "appointment")
@Builder
@Entity
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
    @Getter
    @Column(name = "for_whom")
    private Person for_whom;

}
