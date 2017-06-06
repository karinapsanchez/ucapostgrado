package ar.edu.uca.objetos.primos;

import java.util.Collections;
import java.util.List;

public class Formato {
	
	protected String formato = "pretty";
	
	public Formato(String formato){
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	

	public void imprimirFormato(List<Integer> numerosPrimos){
		
		String result = "";
    	
            for (Integer integer : numerosPrimos) {
			
    		result += String.valueOf(integer) + " ";
		}
    	
            System.out.println(result);
		
	}
	
	public void imprimirFormatoDesc(List<Integer> numerosPrimos){
		
		String result = "";
		
		 Collections.sort(numerosPrimos, Collections.reverseOrder());
    	
    	for (Integer integer : numerosPrimos) {
			
    		result += String.valueOf(integer) + " ";
		}
    	
    	System.out.println(result);
		
	}
	
	public Formato formatoDefault(){
		return new Formato(getFormato());
	}
	
	public FormatoQuiet formatoQuiet(){
		return new FormatoQuiet(getFormato());
	}
	
	
	
}
