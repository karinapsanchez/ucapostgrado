/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.uca.objetos.primos;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Karina
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
	
	
	
	
    public static void main(String[] args) {
  
    	if (args.length == 0) { //si no hay parámetros      
            System.out.println("Se deberá ingresar un numero");
        }else{
            List<Integer> factoresPrimos = obtenerFactoresPrimos(Integer.parseInt(args[0]));
            
            if (args.length > 0){

            	ImprimeFactoresPrimos impFactoresPrimos = new ImprimeFactoresPrimos(new  Formato(args[1]));
            	if(args.length == 3 && args[2].split("=")[0].toUpperCase().trim().equals("--OUTPUT-FILE")){
            		impFactoresPrimos.imprimirArchivoFactoresPrimos(args[2].split("=")[1].toUpperCase().trim(), factoresPrimos,null);   
            	}else if (args.length == 4 && args[2].split("=")[0].toUpperCase().trim().equals("--OUTPUT-FILE")){
            		impFactoresPrimos.imprimirArchivoFactoresPrimos(args[2].split("=")[1].toUpperCase().trim(), factoresPrimos,args[3].split("=")[1].toUpperCase().trim());
            	}
            	if (args.length== 3 && args[2].split("=")[0].toUpperCase().trim().equals("--SORT")){
            	   Orden orden = new Orden (args[2].split("=")[1]);
                   impFactoresPrimos.imprimirFactoresPrimos(factoresPrimos, Integer.parseInt(args[0]), orden);
            	}
            	
            }
        }      
    
    }
    /*
    * Obtiene una lista de los factores primos de un numero ingresado por el usuario
    */
    private static List<Integer> obtenerFactoresPrimos(int num){
        
        List<Integer> listaFactoresPrimos = new ArrayList<Integer>();
        
         int factorMinimo = 2;
         
           if(num== 1){
               listaFactoresPrimos.add(1);
           }else{
                while(num >=factorMinimo){
                    if(num%factorMinimo == 0){
                        num /= factorMinimo;
                  
                        listaFactoresPrimos.add(factorMinimo);
                  
                    }else if (factorMinimo >2){
                        factorMinimo +=2;
                    }else{
                        factorMinimo++;
                    }
                }
 
           }
        
           
           
        return listaFactoresPrimos;
    }

}
