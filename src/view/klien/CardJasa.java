/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.klien;


import javax.swing.*;
import java.awt.*;
import model.Jasa;


public class CardJasa extends JPanel {


    JLabel lblNama;
    JLabel lblHarga;
    JLabel lblFoto;
    JButton btnDetail;



    public CardJasa(Jasa jasa){


        setLayout(new BorderLayout());

        setPreferredSize(new Dimension(600,120));


        // foto
        lblFoto = new JLabel("FOTO");

        lblFoto.setPreferredSize(
                new Dimension(100,100)
        );


        add(lblFoto, BorderLayout.WEST);



        // bagian tengah
        JPanel tengah = new JPanel();

        tengah.setLayout(
                new BoxLayout(
                tengah,
                BoxLayout.Y_AXIS)
        );



        lblNama =
        new JLabel(
        jasa.getNama()
        );



        lblHarga =
        new JLabel(
        "Rp " + jasa.getHarga()
        );



        tengah.add(lblNama);

        tengah.add(lblHarga);



        add(
        tengah,
        BorderLayout.CENTER
        );



        // tombol

        btnDetail =
        new JButton("Lihat Detail");


        add(
        btnDetail,
        BorderLayout.EAST
        );


    }


}
