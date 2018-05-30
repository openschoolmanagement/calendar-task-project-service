package open.schoolmanagement.time.calendartaskprojectservice.domain.project;

import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.task.Task;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Builder
@Entity
@Table(name = "projecttask")
public class ProjectTask {

    @Getter
    @Id
    @GeneratedValue
    private UUID id;

    @Getter
    @OneToOne(mappedBy = "project",
            fetch = FetchType.LAZY)
    private Project project;


    @Getter
    @OneToOne(mappedBy = "task",
            fetch = FetchType.LAZY)
    private Task task;



    @Getter
    @OneToOne(mappedBy = "predecessor",
            fetch = FetchType.LAZY)
    private ProjectTask predecessor;

    @Getter
    @OneToMany(mappedBy = "state",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ProjectTask> successor;

}
