package org.application.master.config;

import org.application.master.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")

public class TestConfig {
   @Autowired
   //Indíca a injeção de dependência automática via springboot
   private UserRepository userRepository;
}
