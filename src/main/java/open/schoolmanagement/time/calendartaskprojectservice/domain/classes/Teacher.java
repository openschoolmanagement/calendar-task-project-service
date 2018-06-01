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

package open.schoolmanagement.time.calendartaskprojectservice.domain.classes;


import java.util.Collection;
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

@Builder
@Entity
@Table(name = "teacher")
public class Teacher {

  @Getter
  @Id
  @GeneratedValue
  @Column(name = "teacher_id")
  private Long teacherId;

  @Getter
  @OneToOne(mappedBy = "person")
  @JoinColumn(name = "person_id")
  private Person person;

  @Getter
  @OneToMany(mappedBy = "teacher_id", fetch = FetchType.LAZY)
  private Collection<SchoolSubjectRelation> subjectRelations;


}
