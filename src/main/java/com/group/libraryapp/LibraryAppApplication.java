package com.group.libraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //포인트는 마법 같은 일을 자동으로 해줌. 스프링을 실행시킬 때 필요한 설정을 자동으로 해줌.
public class LibraryAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(LibraryAppApplication.class, args); //서버를 실행시키는 코드
  }

}
