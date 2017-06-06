package ar.edu.uca.objetos.primos;

import java.util.Collections;
import java.util.List;


public class FormatoQuiet extends Formato{

	
	public FormatoQuiet(String formato) {
		super(formato);
	}

        @Override
	public void imprimirFormato(List<Integer> factoresPrimos){
		
            
            Collections.sort(factoresPrimos, Collections.reverseOrder());
            for (Integer integer : factoresPrimos) {
			
    		System.out.println(integer);
		}
	}
	
        
        public void imprimirFormatoAsc(List<Integer> factoresPrimos){ 
            for (Integer integer : factoresPrimos) {
    		System.out.println(integer);
		}
	}
	
}
