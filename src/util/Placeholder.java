/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Color;
import javax.swing.JTextField;


public class Placeholder {


    public static void addPlaceholder(
            JTextField textField,
            String text
    ){


        textField.setText(text);

        textField.setForeground(Color.GRAY);



        textField.addFocusListener(
            new java.awt.event.FocusAdapter(){


            @Override
            public void focusGained(
            java.awt.event.FocusEvent e){


                if(textField.getText().equals(text)){


                    textField.setText("");

                    textField.setForeground(Color.BLACK);


                }


            }



            @Override
            public void focusLost(
            java.awt.event.FocusEvent e){



                if(textField.getText().isEmpty()){


                    textField.setText(text);

                    textField.setForeground(Color.GRAY);


                }


            }


        });



    }


}
