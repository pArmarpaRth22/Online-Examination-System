/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.connection;

import java.sql.*;

/**
 *
 * @author hp
 */
public class DBCon {
    private static Connection con=null;
    
    public static Connection getConn() throws ClassNotFoundException, SQLException{
        if(con==null){
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project","root","parth");
             System.out.println("Connected...");
        }
        return con;
    }
}
