package com.sj.athletic.meeting.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * @author sunjian.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class User extends BaseModel{
    private String name;
}
