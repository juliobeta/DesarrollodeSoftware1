/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

/**
 *
 * @author JeffBonilla
 */
public class Division {
   public static float  CDivision(float a, float b){
       float div;
       if(b!=0){
       div= a/b;
       System.out.println("la division es : "+div);
       } else{
           System.out.println("no puede dividir para cero");
           div=0;
           
       }
       return div;
  }   
}
