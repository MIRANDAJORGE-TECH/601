
package pkg3.v2trefiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class V2TREFIV {

    
    public static void main(String[] args) throws IOException {
        //DECLARACION DE VARIABLES
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            int num;
                int mult3;
                int mult5;
        //Entrada de datos
        System.out.println("Dame el numero");
        int numero = Integer.parseInt(bufEntrada.readLine());
        
        //Procesar datos
        
            mult3 = numero % 3;
            mult5 = numero % 5;
            
            //Salida de datos
                if(mult3 == 0 && mult5 ==0){
                    System.out.println("TRIFIV");
                } else if(mult3 == 0){
                    System.out.println("TRI");
                }else if (mult5 ==0){
                    System.out.println("FIV");
                }
    
            
       
    }
    
}
