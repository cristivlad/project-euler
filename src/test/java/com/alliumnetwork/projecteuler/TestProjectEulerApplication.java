package com.alliumnetwork.projecteuler;

import org.springframework.boot.SpringApplication;

public class TestProjectEulerApplication {

  public static void main(String[] args) {
    SpringApplication.from(ProjectEulerApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}
