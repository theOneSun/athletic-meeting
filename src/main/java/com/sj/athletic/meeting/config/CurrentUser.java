package com.sj.athletic.meeting.config;

import io.ebean.config.CurrentUserProvider;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author sunjian.
 */
@Component
public class CurrentUser implements CurrentUserProvider {
    /**
     * Return the current user id.
     * <p>
     * The type returned should match the type of the properties annotated
     * with @WhoCreated and @WhoModified. These are typically String, Long or UUID.
     * </p>
     */
    @Override
    public Object currentUser() {
        //todo 返回当前用户的id,类型是uuid
        return UUID.fromString("02555a62-61da-4f79-9b0a-029fd3ea7471");
//        return "当前登录的用户id";
    }
}
