package open.schoolmanagement.time.calendartaskprojectservice.model.calendar.vacation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Vacation {




    @Getter
    @Setter
    private Date start;
    @Getter
    @Setter
    private Date end;
    @Getter
    @Setter
    private int year;
    @Getter
    @Setter
    private String stateCode;
    @Getter
    @Setter
    private String slug;


}
