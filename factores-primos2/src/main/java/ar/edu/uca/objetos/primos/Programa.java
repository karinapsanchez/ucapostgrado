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
	
	private FormatoDefault formato;
	
	
    public static void main(String[] args) {
  
    	if (args.length == 0) { //si no hay parámetros      
            System.out.println("Se deberá ingresar un numero");
        }
        	
       if(args.length>0){
           
    	   List<Integer> factoresPrimos = obtenerFactorPrimo(Integer.parseInt(args[0]));
    	   
    	   if(args.length==2){
    		   	   
    		   Programa controlador = new Programa(new FormatoDefault(args[1]));
    		   
    		   controlador.formatoFactoresPrimos(factoresPrimos);         	    	
    	   }  
    	   
       }
       
    }
    
    public Programa( FormatoDefault formato ){
		this.formato = formato;
	}
    
	public FormatoDefault getFormato() {
		return formato;
	}

	public void setFormato(FormatoDefault formato) {
		this.formato = formato;
	}
    
    

    private void formatoFactoresPrimos (List<Integer> factoresPrimos){
    		
    	String formatoResult = tipoFormato(formato.getFormato());
    	
    	System.out.println("Los numeros primos son: ");
    	
    	if (formatoResult.toUpperCase().equalsIgnoreCase("PRETTY")){
    		
    		formato.formatoDefault().imprimirFormato(factoresPrimos);
    		
    	}else{
    		
    		formato.formatoQuiet().imprimirFormato(factoresPrimos);
    	}
    	
    	
    }
    
    private static String tipoFormato(String formato){
    	
    	String[] formatos = formato.split("=");
    	
    	return formatos[1];
    	
    }
    
    private static List<Integer> obtenerFactorPrimo(int num){
        
        List<Integer> listaFactoresPrimos = new ArrayList<Integer>();
        
         int factorMinimo = 2;
        
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
        return listaFactoresPrimos;
    }

}
