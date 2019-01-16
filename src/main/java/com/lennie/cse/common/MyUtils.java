package com.lennie.cse.common;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyUtils {
    private static DruidDataSource dataSource;
    static {
        init();
    }

    public static DruidDataSource getDataSource(){
        return dataSource;
    }


    private static void init(){
        dataSourceInit();
    }
    private static void dataSourceInit(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/cse.CSEJavaChassisDemo.bean.xml");
        dataSource = (DruidDataSource) applicationContext.getBean("dataSource");
    }
    private static void mybatisInit(){

    }
}
