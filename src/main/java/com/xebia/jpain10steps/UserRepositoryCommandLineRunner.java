package com.xebia.jpain10steps;

import com.xebia.jpain10steps.entity.User;
import com.xebia.jpain10steps.service.UserDaoService;
import com.xebia.jpain10steps.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log= LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user=new User("Anshul","Admin");
        userRepository.save(user);
       log.info("New User Is Created ---------" + user);
       Optional<User> user1=userRepository.findById(1L);
       log.info("Retrived user with ID one: "+user1);
       List<User> users=userRepository.findAll();
       log.info("All users:- "+users);

    }
}
