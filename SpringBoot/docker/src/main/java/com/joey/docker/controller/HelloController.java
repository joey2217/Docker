package com.joey.docker.controller;

import com.joey.docker.entity.UserEntity;
import com.joey.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author EDZ
 * @create 2019-03-12 17:22
 * @desc Hello
 */
@RestController
public class HelloController {
  
  @Autowired
  private UserRepository userRepository;
  
  @GetMapping("/hello")
  public List<UserEntity> hello(){
    return userRepository.findAll();
  }
}
