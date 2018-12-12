package com.sj.athletic.meeting.config;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.CurrentUserProvider;
import io.ebean.config.ServerConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sunjian.
 */
@Component
public class MyEbeanServerFactory implements FactoryBean<EbeanServer> {

    private final CurrentUserProvider currentUser;

    @Autowired
    public MyEbeanServerFactory(CurrentUserProvider currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public EbeanServer getObject() {
        return createEbeanServer();
    }

    @Override
    public Class<?> getObjectType() {
        return EbeanServer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    /**
     * Create a EbeanServer instance.
     */
    private EbeanServer createEbeanServer() {

        ServerConfig config = new ServerConfig();
        config.setName("db");
        config.setCurrentUserProvider(currentUser);

        // load configuration from ebean.properties
        config.loadFromProperties();
        config.setDefaultServer(true);
        // other programmatic configuration

        //建表
        config.setDdlRun(true);
        config.setDdlGenerate(true);

        //数据库建表方式:true 只创建不删除;false 先删除表再创建
        config.setDdlCreateOnly(true);

        //设置关闭懒加载--可以只查询部分字段
        config.setDisableLazyLoading(true);

        return EbeanServerFactory.create(config);
    }
}
