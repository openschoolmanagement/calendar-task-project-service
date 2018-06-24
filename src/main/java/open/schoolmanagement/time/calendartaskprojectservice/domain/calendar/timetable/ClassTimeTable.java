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
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import open.schoolmanagement.time.calendartaskprojectservice.domain.classes.SchoolClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;


@Entity
@Table(name = "classtimetable")
public class ClassTimeTable {

  @Id
  @GeneratedValue
  @Column(name = "classtimetable_id")
  private Long classTimeTableId;

  @OneToOne
  @JoinColumn(name = "schoolclass_id")
  private SchoolClass schoolClass;

  @OneToMany
  @JoinColumn(name = "classtimetable_id")
  private Collection<TimeTableRelation> timeTableRelations;

  private ClassTimeTable(ClassTimeTableBuilder builder) {
    this.schoolClass = builder.schoolClass;
    this.timeTableRelations = builder.timeTableRelations;
  }


  public Long getClassTimeTableId() {
    return classTimeTableId;
  }

  public void setClassTimeTableId(Long classTimeTableId) {
    this.classTimeTableId = classTimeTableId;
  }

  public SchoolClass getSchoolClass() {
    return schoolClass;
  }

  public void setSchoolClass(SchoolClass schoolClass) {
    this.schoolClass = schoolClass;
  }

  public Collection<TimeTableRelation> getTimeTableRelations() {
    return timeTableRelations;
  }

  public void setTimeTableEntries(Collection<TimeTableRelation> timeTableRelations) {
    this.timeTableRelations = timeTableRelations;
  }


  public void addTimeTableRelation(TimeTableRelation timeTableRelation) {
    this.timeTableRelations.add(timeTableRelation);
  }

  public void removeTimeTableRelation(TimeTableRelation timeTableRelation) {
    this.timeTableRelations.remove(timeTableRelation);
  }

  public void removeTimeTableEntry(Long timeTableRelationId) {
    this.timeTableRelations.stream().filter(timeTableRelation -> Objects.equals(timeTableRelation
        .getTimeTableRelationId(), timeTableRelationId)).findFirst()
        .ifPresent(this::removeTimeTableRelation);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ClassTimeTable)) {
      return false;
    }
    ClassTimeTable that = (ClassTimeTable) o;
    return Objects.equals(getClassTimeTableId(), that.getClassTimeTableId())
        && Objects.equals(getSchoolClass(), that.getSchoolClass())
        && Objects.equals(getTimeTableRelations(), that.getTimeTableRelations());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getClassTimeTableId(), getSchoolClass(), getTimeTableRelations());
  }


  public static final class ClassTimeTableBuilder {

    private SchoolClass schoolClass;
    private Collection<TimeTableRelation> timeTableRelations;

    public static ClassTimeTableBuilder builder() {
      return new ClassTimeTableBuilder();
    }

    public ClassTimeTableBuilder setSchoolClass(SchoolClass schoolClass) {
      this.schoolClass = schoolClass;
      return this;
    }

    public ClassTimeTableBuilder setTimeTableEntries(Collection<TimeTableRelation> timeTableRelations) {
      this.timeTableRelations = timeTableRelations;
      return this;
    }

    public ClassTimeTable build() {
      return new ClassTimeTable(this);
    }
  }
}
