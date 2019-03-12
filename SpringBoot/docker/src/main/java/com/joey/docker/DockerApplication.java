package com.joey.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EDZ
 */

@SpringBootApplication
@RestController
public class DockerApplication {

  @GetMapping("/")
  public String hello(){
    return  "Hello from Springboot-docker";
  }
  
  public static void main(String[] args) {
    SpringApplication.run(DockerApplication.class, args);
  }

}
