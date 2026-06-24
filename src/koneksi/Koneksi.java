/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Koneksi {


    private static Connection conn;


    public static Connection getConnection(){


        if(conn == null){


            try{


                String url =
                "jdbc:mysql://localhost:3306/marketplace_freelance";


                String user = "root";

                String password = "";



                conn = DriverManager.getConnection(
                        url,
                        user,
                        password
                );



                System.out.println(
                        "Database Berhasil Terhubung"
                );


            }catch(Exception e){


                JOptionPane.showMessageDialog(null,
                        "Koneksi gagal : "
                        + e.getMessage()
                );


            }

        }


        return conn;


    }


}
