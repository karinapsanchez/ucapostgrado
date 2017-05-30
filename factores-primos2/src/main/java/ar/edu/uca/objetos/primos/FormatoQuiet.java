package ar.edu.uca.objetos.primos;

import java.util.List;


public class FormatoQuiet extends FormatoDefault{

	
	public FormatoQuiet(String formato) {
		super(formato);
	}

	public void imprimirFormato(List<Integer> factoresPrimos){
		
		for (Integer integer : factoresPrimos) {
			
    		System.out.println(integer);
		}
		
	}
	
	
}
