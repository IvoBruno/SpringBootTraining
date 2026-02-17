package org.application.master.config;

import org.application.master.entities.User;
import org.application.master.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.util.Arrays;

@Configuration
//Define this class as a configuration one
@Profile("test")
//Define this class profile as the informed, in that case, test

public class TestConfig implements CommandLineRunner {
   //The CommandLineRunner give us the possibility to use some methods on the execution of the main class
   @Autowired
   //Indicate automatic dependency injection, in this case, with UserRepository. It's important to use this with an interface rather than
   //an implemented class to make easier to make any change and to reuse this class in other implementations
   private UserRepository userRepository;



   @Override
   public void run(String... args) throws Exception {
      //
      User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
      User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

      userRepository.saveAll(Arrays.asList(u1, u2));
      //We use the instance of the userRepository to access some methods to interact with the database, as in the example, save and saveAll are used
      //to persist new objects on the DB, where saveAll needs to receive a List rather than a single object
   }
}
