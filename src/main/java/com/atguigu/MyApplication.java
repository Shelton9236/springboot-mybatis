package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * 	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
 * 		<property name="basePackage" value="com.atguigu.atcrowdfunding.dao"></property>
 * 	</bean>
 */
@EnableTransactionManagement //启用声明式事务
@MapperScan("com.atguigu.dao")  //扫描DAO接口，创建代理对象。
//@ComponentScan("com.atguigu")
@ServletComponentScan //扫描web组件：@WebListener   @WebFilter    @WebServlet
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
        System.out.println("11111111");
    }
}
