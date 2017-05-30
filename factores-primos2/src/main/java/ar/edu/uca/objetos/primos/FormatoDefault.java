package ar.edu.uca.objetos.primos;

import java.util.List;

public class FormatoDefault {
	
	private String formato;
	
	public FormatoDefault(String formato){
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
	
	public FormatoDefault formatoDefault(){
		return new FormatoDefault(getFormato());
	}
	
	public FormatoQuiet formatoQuiet(){
		return new FormatoQuiet(getFormato());
	}
	
	
	
}
