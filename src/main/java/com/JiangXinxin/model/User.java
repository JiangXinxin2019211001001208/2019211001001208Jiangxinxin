package com.JiangXinxin.model;

import java.util.Date;

public class User {
    private int id;
    private String Username;
    private String password;
    private String email;
    private String gender;
    private java.util.Date birthdate;
//constructor
    public User(){
        //full
    }
    public User(int id, String username, String password, String email, String gender, Date birthdate) {
        this.id = id;
        this.Username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.birthdate = birthdate;
    }
//setter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Username;
    }

    public void setName(String name) {
        this.Username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
//to string
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + Username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    public void setUsername(String username) {
    }

    public String getUsername() {
        return null;
    }

    public char getBirthDate() {
        return 0;
    }
}
