package com.banking.bean.life.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.banking.bean.life.cycle.config.SpringConfig;
import com.banking.bean.life.cycle.magmt.EmployeeMagmt;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeMagmt magmt = context.getBean(EmployeeMagmt.class);
//        System.out.println( "Hello World!" );
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig.class);
//        EmployeeMagmt magmt1 = context1.getBean(EmployeeMagmt.class);
//        System.out.println(magmt == magmt1);
        magmt.displayEmp();
        context.close();
    }
}
