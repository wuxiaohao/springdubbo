package com.demo.springdubbo;

import com.demo.springdubbo.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxh
 */
@Slf4j
public class ConsumerClient {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
        context.start();

        UserService userService = (UserService)context.getBean("userService");
        String result = userService.login("wuxiaohao");
        log.info(result);

    }

}
