/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class Biodata {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String nama, nis, lahir, tgl, jk, kota, motto;
    System.out.print("Nama           : ");
    nama = input.nextLine();
    System.out.print("NIS            : ");
    nis = input.nextLine();
    System.out.print("Tempat Lahir   : ");
    lahir = input.nextLine();
    System.out.print("Tanggal Lahir  : ");
    tgl = input.nextLine();
    System.out.print("Jenis Kelamin  : ");
    jk = input.nextLine();
    System.out.print("Alamat         : ");
    kota = input.nextLine();
    System.out.print("Motto hidup    : ");
    motto = input.nextLine();
    System.out.println("Nama            :"+ nama);
    System.out.println("NIS             :"+ nis);
    System.out.println("Tempat Lahir    :"+ lahir);
    System.out.println("Tanggal Lahir   :"+ tgl);
    System.out.println("Jenis Kelamin   :"+ nama);
    System.out.println("Alamat          :"+ kota);
    System.out.println("Motto hidup     :"+ motto);
    }
}
