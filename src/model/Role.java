/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Role {


    private int id_role;

    private String nama_role;



    public Role(){

    }



    public Role(int id_role, String nama_role){

        this.id_role = id_role;

        this.nama_role = nama_role;

    }



    public int getId_role(){

        return id_role;

    }



    public String getNama_role(){

        return nama_role;

    }


}
