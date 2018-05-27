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

package open.schoolmanagement.time.calendartaskprojectservice.domain.lending;

import lombok.Builder;
import lombok.Getter;
import open.schoolmanagement.time.calendartaskprojectservice.domain.person.Person;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Builder
@Table(name = "lendboject")
public class LendObject {

    @Getter
    @Id
    @GeneratedValue
    private UUID id;

    @Getter
    @Column(name = "name")
    private String name;

    @Getter
    @OneToOne(mappedBy = "owner", fetch = FetchType.LAZY)
    private Person owner;

    @Getter
    @OneToOne(mappedBy = "lendbywhom", fetch = FetchType.LAZY)
    private Person lendByWhom;

    @Getter
    @Column(name = "whenlend")
    private Date whenLend;

    @Getter
    @Column(name = "duetoreturn")
    private Date dueToReturn;

    @Getter
    @Column(name = "returned")
    private boolean returned;


}
