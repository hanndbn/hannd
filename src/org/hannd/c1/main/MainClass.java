package org.hannd.c1.main;

import org.hannd.c1.service.GreetingMessageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by MT257 on 11/18/2015.
 */

public class MainClass {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        GreetingMessageService greetServices = context.getBean("greetingMessageServiceImpl", GreetingMessageService.class);
        System.out.println(greetServices.greetUser());
    }
}
