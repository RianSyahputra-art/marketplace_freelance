/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Jasa {


    private int id_jasa;
    private String nama;
    private String deskripsi;
    private String kategori;
    private int harga;
    private String foto;



    public Jasa(
            String nama,
            String deskripsi,
            String kategori,
            int harga,
            String foto
    ){

        this.nama = nama;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.harga = harga;
        this.foto = foto;

    }



    public String getNama(){

        return nama;

    }


    public String getDeskripsi(){

        return deskripsi;

    }


    public int getHarga(){

        return harga;

    }


    public String getFoto(){

        return foto;

    }


}