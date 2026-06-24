/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class UserRole {


    private int id_user;

    private int id_role;



    public UserRole(){

    }



    public UserRole(int id_user,int id_role){

        this.id_user = id_user;

        this.id_role = id_role;

    }



    public int getId_user(){

        return id_user;

    }



    public int getId_role(){

        return id_role;

    }


}
