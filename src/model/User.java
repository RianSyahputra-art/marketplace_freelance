/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class User {


    private int id_user;

    private String nama;

    private String email;

    private String password;



    public User(){

    }



    public User(String nama, String email, String password){

        this.nama = nama;

        this.email = email;

        this.password = password;

    }



    public int getId_user(){

        return id_user;

    }



    public String getNama(){

        return nama;

    }



    public String getEmail(){

        return email;

    }



    public String getPassword(){

        return password;

    }



    public void setNama(String nama){

        this.nama = nama;

    }



    public void setEmail(String email){

        this.email = email;

    }



    public void setPassword(String password){

        this.password = password;

    }


}