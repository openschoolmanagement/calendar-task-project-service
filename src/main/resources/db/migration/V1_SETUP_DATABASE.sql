CREATE DATABASE  IF NOT EXISTS OSM_CALENDAR ;



create table IF NOT EXISTS OSM_CALENDAR.PERSON (
    person_id BIGINT not null,
    emailaddress TEXT CHARACTER SET utf8,
    firstname TEXT CHARACTER SET utf8,
    lastname TEXT CHARACTER SET utf8
);

create table IF NOT EXISTS OSM_CALENDAR.TASK (
    task_id BIGINT not null,
    name TEXT CHARACTER SET utf8,
    description TEXT CHARACTER SET utf8,
    deadline DATETIME not null,
    started BOOLEAN not null,
    reminder DATETIME not null,
    taskgiver BIGINT not null,
    taskexecutor BIGINT
);

create table IF NOT EXISTS OSM_CALENDAR.PROJECT(
    project_id BIGINT not null,
    name TEXT CHARACTER SET utf8,
    description TEXT CHARACTER SET utf8,
    responsible BIGINT not null,
    project_start DATETIME not null,
    project_end DATETIME not null
);


create table IF NOT EXISTS  OSM_CALENDAR.PROJECTTASK(
    projecttask_id BIGINT not null,
    project_id BIGINT not null,
    task_id BIGINT not null
);

create table IF NOT EXISTS  OSM_CALENDAR.PROJECTTASKSELFRELATION(
    projecttaskselfrelation_id BIGINT not null,
    projecttask_id BIGINT not null,
    predecessor_id BIGINT not null
);

create table IF NOT EXISTS  OSM_CALENDAR.APPOINTMENT(
    appointment_id BIGINT not null,
    appointment_start DATETIME not null,
    appointment_end DATETIME not null,
    appointment_duration BIGINT not null,
    appointment_subject TEXT CHARACTER SET utf8,
    description TEXT CHARACTER SET utf8,
    location TEXT CHARACTER SET utf8,
    owner  BIGINT not null 
);


create table IF NOT EXISTS  OSM_CALENDAR.MEETING(
    meeting_id BIGINT not null,
    meeting_start DATETIME not null,
    meeting_end DATETIME not null,
    duration BIGINT not null,
    meeting_subject  TEXT CHARACTER SET utf8,
    location TEXT CHARACTER SET utf8
);

create table IF NOT EXISTS  OSM_CALENDAR.MEETING_INVITEDPERSON_RELATION(
    meeting_invitedperson_relation_id BIGINT not null,
    meeting_id BIGINT not null,
    person_id BIGINT not null
);
 

