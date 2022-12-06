package com.hasbi.springaop;

import com.hasbi.springaop.aspects.MyApplicationContext;
import com.hasbi.springaop.service.IMetier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAopApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);

        MyApplicationContext.authenticateUser("root","1234",new String[]{"ADMIN"});
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        IMetier metier=context.getBean(IMetier.class);
        metier.process();
        System.out.println(metier.compute());
    }

}
