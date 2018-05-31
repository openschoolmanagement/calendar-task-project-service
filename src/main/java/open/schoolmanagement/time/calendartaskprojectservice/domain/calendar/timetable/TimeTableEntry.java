/*
   Copyright 2018 Open School Management
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
       http://www.apache.org/licenses/LICENSE-2.0
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.timetable;

import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.classes.SchoolClass;
import open.schoolmanagement.time.calendartaskprojectservice.domain.classes.Teacher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.UUID;

@Builder
@Entity
@Table(name = "timetableentry")
public class TimeTableEntry {

    @Getter
    @Id
    @GeneratedValue
    private UUID id;

    @Getter
    @Column(name = "course")
    private String course;

    @Getter
    @OneToOne(mappedBy = "schoolclass")
    private SchoolClass schoolClass;

    @Getter
    @OneToOne(mappedBy = "subject")
    private Subject subject;

    @Getter
    @OneToOne(mappedBy = "teacher")
    private Teacher teacher;

    @Getter
    @Column(name = "room")
    private String room;

    @Getter
    @Column(name = "weekday")
    private WeekDay weekDay;

    @Getter
    @Column(name = "schoolhour")
    private SchoolHour schoolHour;

}