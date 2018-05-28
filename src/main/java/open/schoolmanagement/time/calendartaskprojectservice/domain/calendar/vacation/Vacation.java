package open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.vacation;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Builder
@Entity
@Table(name = "vacation")
public class Vacation {

    @Getter
    @Id
    @GeneratedValue
    private UUID id;

    @Getter
    @Setter
    @Column(name = "start")
    private Date start;
    @Getter
    @Setter
    @Column(name = "end")
    private Date end;
    @Getter
    @Setter
    @Column(name = "year")
    private int year;
    @Getter
    @Setter
    @OneToOne(mappedBy = "state", fetch = FetchType.LAZY)
    private State state;
    @Getter
    @Setter
    @Column(name = "slug")
    private String slug;


}
