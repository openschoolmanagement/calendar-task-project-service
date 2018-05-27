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

package open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.vacation;

import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.calendar.Constants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Builder
@Entity
@Table(name = "publicholiday")
public class PublicHoliday implements Constants {


    @Getter
    @Id
    @GeneratedValue
    private UUID id;

    @Getter
    @Column(name = "day")
    private  Date day;

    @Getter
    @Column(name = "name")
    private  String name;

    @Getter
    @OneToMany(mappedBy = "state",
            fetch = FetchType.LAZY)
    private Collection<State> affectedCountriesInStateCode; //
}
