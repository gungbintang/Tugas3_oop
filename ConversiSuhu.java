/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert902;

/**
 *
 * @author Anak Agung Bintang Purnama D_20103019
 */
public class ConversiSuhu {
    //Property
    private double HASIL, C, F, jns;

    public void setC(double nilai){
        this.C = nilai;
    }
    public void setF(double nilai){
        this.F = nilai;
    }
    
    public double getHASIL(){
      return this.HASIL;  
    }

    public double Conversi(String jns){
        //conversi suhu C-->F ==> 9/5*C+32  F-->C ==> 5/9*C-32
       if(jns == "C2F"){
           this.HASIL= (9*this.C/5)+32;
           return this.HASIL;
       }else if (jns == "F2C"){
        this.HASIL= (this.F-32)*5/9;
        return this.HASIL;
    }
    return 0;
    }
}