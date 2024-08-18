/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

/**
 *
 * @author hp
 */
public class Student {
    int id;
    String username;
    String email;
    String password;
    String marks;

    public Student(String username, String email, String password, String marks) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.marks = marks;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
    
    
    
}
