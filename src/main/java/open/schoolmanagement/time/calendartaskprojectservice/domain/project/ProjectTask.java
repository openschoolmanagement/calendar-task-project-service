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

package open.schoolmanagement.time.calendartaskprojectservice.domain.project;

import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.task.Task;

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
