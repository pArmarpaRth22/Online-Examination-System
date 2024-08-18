/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.dao;

import com.app.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class UserDao {
    private Connection con;
    private String query;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public UserDao(Connection con) {
        this.con=con;
    }
    
    public Student userLogin(String email,String password){
        Student student=null;
        try{
            query="select * from login where email=? and password=?";
            pstmt=this.con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs=pstmt.executeQuery();
            if(rs.next()){
                student=new Student();
                student.setId(rs.getInt(1));
                student.setUsername(rs.getString("username"));
                student.setEmail(rs.getString("email"));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        
        return student;
    }
    
    
}
