package com.tyss.factorypattern.builderpattern;

public class UserObject {

    public static void main(String[] args) {
        User user = User.UserBuilder.builder().setUserName("Ankit").setUserId("TY01").setEmailId("a@gmail.com").build();
        System.out.println(user);
    }
}
