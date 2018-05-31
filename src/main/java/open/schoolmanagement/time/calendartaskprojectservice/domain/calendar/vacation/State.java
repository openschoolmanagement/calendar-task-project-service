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


import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Builder
@Entity
@Table(name = "state")
public class State {


  /* *
  * Bundesland    Code
  * Baden-Württemberg Baden-Württemberg  DE-BW
  * Bayern Bayern   DE-BY
  * Berlin Berlin  DE-BE
  * Brandenburg Brandenburg DE-BB
  * Bremen Bremen  DE-HB
  * Hamburg Hamburg DE-HH
  * Hessen Hessen DE-HE
  * Mecklenburg-Vorpommern Mecklenburg-Vorpommern DE-MV
  * Niedersachsen Niedersachsen DE-NI
  * Nordrhein-Westfalen Nordrhein-Westfalen DE-NW
  * Rheinland-Pfalz Rheinland-Pfalz DE-RP
  * Saarland Saarland DE-SL
  * Sachsen Sachsen DE-SN
  * Sachsen-Anhalt Sachsen-Anhalt  DE-ST
  * Schleswig-Holstein Schleswig-Holstein DE-SH
  * Thüringen Thüringen DE-TH
  *
  * https://de.wikipedia.org/wiki/ISO_3166-2
  * https://de.wikipedia.org/wiki/ISO_3166#ISO_3166-1
  *
  * Also Check https://www.ferien-api.de/
  * */

  @Getter
  @Id
  @GeneratedValue
  private Long id;
  @Getter
  @Column(name = "name")
  String name; //Saarland
  @Getter
  @Column(name = "isocode")
  String isoCode; //DE-SL
  @Getter
  @Column(name = "isocodeshort")
  String isoCodeShort; //SL



}
