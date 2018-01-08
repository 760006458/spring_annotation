package com.heima.application;

import com.heima.dao.UserDao;
import com.mchange.v2.c3p0.DataSources;
import com.mchange.v2.c3p0.mbean.C3P0PooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.naming.NamingException;
import java.beans.PropertyVetoException;

/**
 * xuan
 * 2018/1/7
 */

@Configuration
@ComponentScan(value = "com.heima")
@PropertySource(value = {"classpath:db.properties"})
public class MyApplication {

    @Value("${driverClass}")
    private String driverClass;
    @Value("${jdbcUrl}")
    private String jdbcUrl;
    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;

    @Bean
    public UserDao abc() {    // <bean id="abc" class="com.heima.dao.UserDao"/>
        return new UserDao();
    }

    @Bean
    public C3P0PooledDataSource dataSources() throws PropertyVetoException, NamingException {
        C3P0PooledDataSource dataSource = new C3P0PooledDataSource();
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        return dataSource;
    }
}
