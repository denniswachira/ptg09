package com.dewcis.ptg;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dewcis.ptg.beans.LoginResponse;

@SpringBootApplication
public class ConsumingWebServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsumingWebServiceApplication.class, args);
  }

  @Bean
  CommandLineRunner lookup(Login login) {
    return args -> {
      String username = "ptg_integration";
      String password = "9DyOJATR";
     
      LoginResponse response = login.getLogin(username, password);
      
    };
  }

}
