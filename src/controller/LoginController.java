/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import koneksi.Koneksi;



public class LoginController {


    public int login(String email, String password){


        try{


            Connection conn =
            Koneksi.getConnection();



            String sql =
            """
            SELECT user_role.id_role
            FROM user
            JOIN user_role
            ON user.id_user = user_role.id_user
            WHERE email=? AND password=?
            """;



            PreparedStatement ps =
            conn.prepareStatement(sql);



            ps.setString(1,email);

            ps.setString(2,password);



            ResultSet rs =
            ps.executeQuery();



            if(rs.next()){


                return rs.getInt("id_role");


            }


        }catch(Exception e){


            System.out.println(e.getMessage());


        }


        return 0;


    }


}