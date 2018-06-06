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

import java.util.Collection;
import java.util.UUID;
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
import open.schoolmanagement.time.calendartaskprojectservice.domain.classes.SchoolClass;

@Builder
@Entity
@Table(name = "classtimetable")
public class ClassTimeTable {

  @Getter
  @Id
  @GeneratedValue
  @Column(name = "classtimetable_id")
  private Long classTimeTableId;

  @Getter
  @OneToOne(mappedBy = "schoolclass")
  @JoinColumn(name = "schoolclass_id")
  private SchoolClass schoolClass;

  @Getter
  @OneToMany(mappedBy = "timetableentry", fetch = FetchType.LAZY)
  private Collection<TimeTableEntry> timeTableEntries;

}
