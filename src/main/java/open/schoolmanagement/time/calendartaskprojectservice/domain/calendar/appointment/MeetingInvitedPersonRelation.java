package open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.appointment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;

@Table(name = "meeting_invitedperson_relation")
@Builder
@Entity
public class MeetingInvitedPersonRelation {

  @Getter
  @Id
  @GeneratedValue
  @Column(name = "meeting_invitedperson_relation_id", nullable = false)
  private Long meetingInvitedPersonRelationId;

  @Getter
  @OneToOne(mappedBy = "meeting_id", fetch = FetchType.LAZY)
  private Meeting meeting;


  @Getter
  @OneToOne(mappedBy = "person_id", fetch = FetchType.LAZY)
  private Person person;


}
