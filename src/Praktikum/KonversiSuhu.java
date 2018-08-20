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
public class KonversiSuhu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float c, r, f, k;
        System.out.print("Suhu Celcius = ");
        c = input.nextFloat();
        r = 4 * c / 5;
        f = (9 * c / 5) + 32;
        k = c + 273;
        System.out.println("----Converted----");
        System.out.println("Reamur = "+r);
        System.out.println("Fahrenheit = "+f);
        System.out.println("Kelvin = "+k);
        System.out.println("-----------------");
    }
}
