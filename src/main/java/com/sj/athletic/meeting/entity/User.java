package com.sj.athletic.meeting.entity;

import com.sj.athletic.meeting.observe.Observer;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author sunjian.
 */
@Data
@Entity
@Table(name = "s_user")
public class User extends BaseModel implements Observer {
    private String name;

    @Override
    public boolean equals(Object object) {
        if (this == object && object instanceof User) {
            final User user = (User) object;
            return this.id.equals(user.getId());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public void receiveMessage(String message) {
        //todo 发送通知消息
        final Logger logger = LoggerFactory.getLogger(User.class);
        logger.info(this.name + " 收到了消息: " + message);
    }
}
