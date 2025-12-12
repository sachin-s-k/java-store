package org.example.springstore;

import org.example.springstore.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringStoreApplication {

    public static void main(String[] args) {

//      SpringApplication.run(SpringStoreApplication.class, args);
     var user= User.builder().name("John").password("ass").email("dds").build();




    }

}
