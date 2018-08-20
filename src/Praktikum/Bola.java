/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class Bola {
    public static void main(String[] args){
        System.out.println("Program untuk perhitung bola :");
        String jari = " ";
        jari = JOptionPane.showInputDialog("Masukan Jari - jari nya : ");
        int r = Integer.parseInt(jari);
        System.out.println("Jari - jari = "+(r));
        System.out.println("Luas permukaanya = "+((3.14*r*r)*4));
        System.out.println("Volumenya = "+(((3.14*r*r*r)*4)/3));
        
    }
}
