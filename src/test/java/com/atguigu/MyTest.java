package com.atguigu;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import javafx.application.Application;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Autowired
    UserService userService;

    @Test
    public void testFindAll(){
        List<User> list = userService.findAll();
        System.out.println(list);
    }

    //==============================================
    @Autowired
    DataSource dataSource;

    @Test
    public void testDataSource(){
        //com.zaxxer.hikari.HikariDataSource  //SpringBoot框架默认集成数据源，性能好
        //com.alibaba.druid.pool.DruidDataSource //阿里提供数据源  德鲁伊
        System.out.println(dataSource.getClass());
    }

}
