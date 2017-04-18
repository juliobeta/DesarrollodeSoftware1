
package operacionesbasicas;


public class Csuma {

    public static float Suma(String numero1,String numero2){
        int num1=0,num2=0,suma=0;
        if(!numero1.isEmpty()&& !numero2.isEmpty()){
            num1=Integer.parseInt(numero1);
            num2=Integer.parseInt(numero2);
            suma=num1+num2;
        }
        return suma;
    
}
}
