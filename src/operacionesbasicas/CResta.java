/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

/**
 *
 * @author TOSHIBA
 */
public class CResta {


    public static void main(String[] args) {
        CResta(5,2);
    }
   
    

  public static float  CResta(float a, float b){
       float resta;
       if(a>b){
       resta= a-b;
       } else{
           System.out.println("no puede ser mayor el primer termino");
           resta=0;
       }
       System.out.println("la resta es : "+resta);
  
        return resta;
  }
 
}

