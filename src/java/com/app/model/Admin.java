/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

/**
 *
 * @author hp
 */
public class Admin {
    int id;
    int email;
    int name;

    public Admin(int id, int email, int name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public Admin() {
    }

    public int getId() {
        return id;
    }

    public int getEmail() {
        return email;
    }

    public int getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public void setName(int name) {
        this.name = name;
    }
    
    
    
    
    
}
