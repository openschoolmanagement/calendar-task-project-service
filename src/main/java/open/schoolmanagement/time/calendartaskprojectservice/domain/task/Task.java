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

package open.schoolmanagement.time.calendartaskprojectservice.domain.task;

import java.util.Date;
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

@Builder
@Entity
@Table(name = "task")
public class Task {

  @Getter
  @Id
  @GeneratedValue
  @Column(name = "task_id", nullable = false)
  private Long taskId;

  @Getter
  @Column(name = "name")
  private String name;

  @Getter
  @Column(name = "description")
  private String description;

  @Getter
  @Column(name = "deadline")
  private Date deadline;

  @Getter
  @Column(name = "started")
  private Boolean started;

  @Getter
  @Column(name = "reminder")
  private Date reminder;

  @Getter
  @OneToOne(mappedBy = "taskgiver",
      fetch = FetchType.LAZY)
  private Person taskGiver;

  @Getter
  @OneToOne(mappedBy = "taskexecutor",
      fetch = FetchType.LAZY)
  private Person taskExecutor;


}
