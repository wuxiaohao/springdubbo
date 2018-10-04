package com.demo.springdubbo.service;


import com.demo.springdubbo.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author wxh
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {

    public String login(String name) {
        log.info("进入dubbo服务端登录");
        return "name = "+name;
    }

}
