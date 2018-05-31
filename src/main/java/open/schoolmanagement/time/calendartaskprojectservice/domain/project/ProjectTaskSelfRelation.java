package open.schoolmanagement.time.calendartaskprojectservice.domain.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Builder
@Entity
@Table(name = "projecttaskselfrelation")
public class ProjectTaskSelfRelation {

  @Getter
  @Id
  @GeneratedValue
  @Column(name = "projecttaskselfrelation_id")
  private Long projectTaskSelfRelationId;

  @Getter
  @OneToOne(mappedBy = "projecttask_id",
      fetch = FetchType.LAZY)
  private ProjectTask projectTask;


  @Getter
  @OneToOne(mappedBy = "predecessor_id",
      fetch = FetchType.LAZY)
  private ProjectTask predecessor;

}
