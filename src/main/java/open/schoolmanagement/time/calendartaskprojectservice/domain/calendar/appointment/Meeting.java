package open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.appointment;

import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Table(name = "meeting")
@Builder
@Entity
public class Meeting {

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
    @OneToOne(mappedBy = "person")
    private Person organiser;

    @Getter
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private Collection<Person> invitedPerson;

}
