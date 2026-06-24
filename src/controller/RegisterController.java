/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import koneksi.Koneksi;
import model.User;



public class RegisterController {



    public boolean register(User user, int id_role){


        try{


            Connection conn = Koneksi.getConnection();



            // simpan data user

            String sqlUser =
            "INSERT INTO user(nama,email,password) VALUES(?,?,?)";


            PreparedStatement psUser =
            conn.prepareStatement(
                    sqlUser,
                    Statement.RETURN_GENERATED_KEYS
            );


            psUser.setString(1, user.getNama());

            psUser.setString(2, user.getEmail());

            psUser.setString(3, user.getPassword());


            psUser.executeUpdate();



            // ambil id user yang baru dibuat

            ResultSet rs =
            psUser.getGeneratedKeys();



            int id_user = 0;


            if(rs.next()){

                id_user = rs.getInt(1);

            }



            // simpan role user

            String sqlRole =
            "INSERT INTO user_role(id_user,id_role) VALUES(?,?)";



            PreparedStatement psRole =
            conn.prepareStatement(sqlRole);



            psRole.setInt(1, id_user);

            psRole.setInt(2, id_role);



            psRole.executeUpdate();



            JOptionPane.showMessageDialog(null,
                    "Register Berhasil"
            );


            return true;



        }catch(Exception e){



            JOptionPane.showMessageDialog(null,
                    "Register gagal : "
                    + e.getMessage()
            );



            return false;

        }


    }


}
