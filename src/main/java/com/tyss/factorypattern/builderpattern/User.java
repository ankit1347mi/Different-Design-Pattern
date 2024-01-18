package com.tyss.factorypattern.builderpattern;

import lombok.ToString;

@ToString
public class User {

    private String userId;
    private String userName;
    private String emailId;

    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {

        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
