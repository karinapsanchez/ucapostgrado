/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.uca.objetos.primos;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = ingresoNumero();
        
        System.out.println("Los factores primos son: "+obtenerFactorPrimo(numero));
       
    }
    
    private static int ingresoNumero(){
        
        int num = 0;
        try{
            System.out.println("Ingreso un numero entero: ");
        
            Scanner scanner = new Scanner(System.in);
        
            num = scanner.nextInt();
            
        }catch(Exception ex){
            System.out.println("No es un numero entero lo que ingreso");
        }
        return num;
    }
    
    
    private static String obtenerFactorPrimo(int num){
        
        String resultado = "";

        int factorMinimo = 2;
        
           while(num >=factorMinimo){
               
              if(num%factorMinimo == 0){
                  num /= factorMinimo;
                  
                  resultado += factorMinimo +" ";
              }else if (factorMinimo >2){
                  factorMinimo +=2;
                  }else{
                    factorMinimo++;
                  }
            }
        return resultado;
    }
        
}
