/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert902;

/**
 *
 * @author Anak Agung Bintang Purnama D_20103019
 */
public class Pert902 {
   
    public static void main(String[] args) {
            ConversiSuhu C = new ConversiSuhu();
            C.setC(20);
            C.Conversi("C2F");
            System.out.println("Perhitungan Suhu dari Celcius ke Fahrenheit : ");
            System.out.println(C.getHASIL());
            
    }
    
}
