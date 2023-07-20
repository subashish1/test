package com.spring.security.springsecuritydemo.test;

public class User {

    private final String name;
    private final int id;
    private final String email;

    private User(UserBuilder userBuilder){
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.email = userBuilder.email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
       }

       static class UserBuilder {
           private String name;
           private int id;
           private String email;

           public UserBuilder(){}

           public static UserBuilder builder(){
               return new UserBuilder();
           }

           public UserBuilder setName(String name) {
               this.name = name;
               return this;
           }

           public UserBuilder setId(int id) {
               this.id = id;
               return this;
           }

           public UserBuilder setEmail(String email) {
               this.email = email;
               return this;
           }

           public User build(){
               User u = new User(this);
               return u;
           }
       }

}
