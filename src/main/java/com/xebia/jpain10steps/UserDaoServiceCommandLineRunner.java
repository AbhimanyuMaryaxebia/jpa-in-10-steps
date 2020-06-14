package com.xebia.jpain10steps;

import com.xebia.jpain10steps.entity.User;
import com.xebia.jpain10steps.service.UserDaoService;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log= LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Autowired
    private UserDaoService userDaoService;
    @Override
    public void run(String... args) throws Exception {
        User user=new User("Abhimanyu","Admin");
       long insert= userDaoService.insert(user);
       log.info("New User Is Created ---------" + user);

    }
}
