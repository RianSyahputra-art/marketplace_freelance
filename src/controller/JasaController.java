/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.*;
import java.util.ArrayList;
import model.Jasa;
import koneksi.Koneksi;



public class JasaController {



public ArrayList<Jasa> getRandomJasa(){


ArrayList<Jasa> list =
new ArrayList<>();


try{


Connection conn =
Koneksi.getConnection();



String sql =
"""
SELECT *
FROM jasa
ORDER BY RAND()
LIMIT 10
""";



PreparedStatement ps =
conn.prepareStatement(sql);



ResultSet rs =
ps.executeQuery();



while(rs.next()){


Jasa j =
new Jasa(

rs.getString("nama_jasa"),

rs.getString("deskripsi"),

rs.getString("kategori"),

rs.getInt("harga"),

rs.getString("foto")

);



list.add(j);



}



}catch(Exception e){

System.out.println(e);

}



return list;


}



}