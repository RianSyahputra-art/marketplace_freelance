/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.*;
import koneksi.Koneksi;
import model.User;



public class UserController {


    public void register(User user){


        try{


            String sql =
            "INSERT INTO user(nama,email,password)"
            +"VALUES(?,?,?)";


            PreparedStatement ps =
            Koneksi.getConnection()
            .prepareStatement(sql);



            ps.setString(1,user.getNama());
            ps.setString(2,user.getEmail());
            ps.setString(3,user.getPassword());



            ps.executeUpdate();


            System.out.println("Berhasil Register");



        }catch(Exception e){

            System.out.println(e);

        }

    }

}
