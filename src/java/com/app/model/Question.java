/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

/**
 *
 * @author hp
 */
public class Question {
    
    int id;
    String qno;
    String que;
    String o1;
    String o2;
    String o3;
    String o4;
    String ans;

    public Question(String qno, String que, String o1, String o2, String o3, String o4, String ans) {
        this.qno = qno;
        this.que = que;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
        this.ans = ans;
    }

    public Question() {
    }

    public int getId() {
        return id;
    }

    public String getQno() {
        return qno;
    }

    public String getQue() {
        return que;
    }

    public String getO1() {
        return o1;
    }

    public String getO2() {
        return o2;
    }

    public String getO3() {
        return o3;
    }

    public String getO4() {
        return o4;
    }

    public String getAns() {
        return ans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQno(String qno) {
        this.qno = qno;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public void setO1(String o1) {
        this.o1 = o1;
    }

    public void setO2(String o2) {
        this.o2 = o2;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public void setO4(String o4) {
        this.o4 = o4;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
    
    
    
}
