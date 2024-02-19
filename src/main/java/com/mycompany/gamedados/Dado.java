/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamedados;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author camil
 */
public class Dado {
    private int numero;

    public int getNumero() {
        return numero;
    }
    public void lanzar(Random r){
        numero = r.nextInt(6)+1;
    }
    public void mostrar(JLabel lbl){
        //obtener el nombre del archivo de la imagen
        String nombreArchivo = "C:\\Users\\camil\\OneDrive\\Documentos\\NetBeansProjects\\GameDados\\src\\main\\java\\imagenes\\"+String.valueOf(numero)+".jpg";
        //cargar la imagen
        ImageIcon imagen = new ImageIcon(nombreArchivo);
        //poner la imagen en el label
        lbl.setIcon(imagen);
        
    }
}
