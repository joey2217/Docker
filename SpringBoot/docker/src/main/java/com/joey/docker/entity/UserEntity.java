package com.joey.docker.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author EDZ
 * @create 2019-03-12 17:18
 * @desc UserEntity
 */
@Entity
@Data
@Table(name = "t_user")
public class UserEntity {
  
  @Id
  @GeneratedValue
  private  long id;
  
  @Column
  private String name;
  
}
