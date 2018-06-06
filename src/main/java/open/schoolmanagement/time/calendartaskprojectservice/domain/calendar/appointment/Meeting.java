package open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.appointment;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;

@Table(name = "meeting")
@Builder
@Entity
public class Meeting {

  @Getter
  @Id
  @GeneratedValue
  @Column(name = "meeting_id", nullable = false)
  private Long meetingId;

  @Getter
  @Column(name = "meeting_start")
  private Date start;

  @Getter
  @Column(name = "meeting_end")
  private Date end;

  @Getter
  @Column(name = "duration")
  private long duration;

  @Getter
  @Column(name = "meeting_subject")
  private String subject;

  @Getter
  @Column(name = "location")
  private String location;

  @Getter
  @Column(name = "description")
  private String description;

  @Getter
  @OneToOne(mappedBy = "organiser")
  @JoinColumn(name ="organiser" )
  private Person organiser;

  @Getter
  @OneToMany(mappedBy = "meeting", fetch = FetchType.LAZY)
  private Collection<MeetingInvitedPersonRelation> invitedPerson;

}
