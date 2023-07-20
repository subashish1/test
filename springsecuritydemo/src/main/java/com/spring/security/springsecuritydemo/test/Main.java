package com.spring.security.springsecuritydemo.test;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {
       User u =  new User.UserBuilder()
                .setName("Raj")
                .setId(1)
                .setEmail("raj@gmail.com")
                .build();
        System.out.println(u);

        User u1 = User.UserBuilder.builder()
               .setName("Raj")
                .setId(1)
                .setEmail("raj@gmail.com")
                .build();
        System.out.println(u1);


    }
}
