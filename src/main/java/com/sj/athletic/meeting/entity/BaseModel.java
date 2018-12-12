package com.sj.athletic.meeting.entity;


import io.ebean.Model;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import io.ebean.annotation.WhoCreated;
import io.ebean.annotation.WhoModified;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.sql.Timestamp;
import java.util.UUID;

@SuppressWarnings("WeakerAccess")
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
public class BaseModel extends Model {

    @Id
    UUID id;

    @Version
    Long version;

    @WhenCreated
    Timestamp whenCreated;

    @WhenModified
    Timestamp whenModified;

    @WhoCreated
    UUID whoCreated;

    @WhoModified
    UUID whoModified;
}
