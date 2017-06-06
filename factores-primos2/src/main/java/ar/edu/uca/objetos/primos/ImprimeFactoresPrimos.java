package ar.edu.uca.objetos.primos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class ImprimeFactoresPrimos {
	
	private  Formato formato;
	
	
	public ImprimeFactoresPrimos(Formato formato){
		
		this.formato = formato;
		
	}
	
	
	
	public void imprimirFactoresPrimos (List<Integer> factoresPrimos, int numero, Orden orden){
		
    	String formatoResult = obtenerTipoFormato(formato.getFormato());
        
        System.out.println("Formato: "+formatoResult);
        
         System.out.println("Orden : "+orden);
         
    	if (formatoResult.toUpperCase().equalsIgnoreCase("PRETTY") && (orden == null || orden.getTipo().toUpperCase().trim().equals("ASC"))){
    		System.out.print("Factores primos " +numero + ": ");
    		formato.formatoDefault().imprimirFormato(factoresPrimos);	
    	}else if(formatoResult.toUpperCase().equalsIgnoreCase("PRETTY") && orden.getTipo().toUpperCase().trim().equals("DESC")){
    	
    		formato.formatoDefault().imprimirFormatoDesc(factoresPrimos);
    	}
    	
    	if(formatoResult.toUpperCase().equalsIgnoreCase("QUIET") && (orden==null || orden.getTipo().toUpperCase().trim().equals("DESC"))){
    		
    		formato.formatoQuiet().imprimirFormato(factoresPrimos);
    		
    	}else if (formatoResult.toUpperCase().equalsIgnoreCase("QUIET") && orden.getTipo().toUpperCase().trim().equals("ASC")){
    		formato.formatoQuiet().imprimirFormatoAsc(factoresPrimos);
    	}
    	
    	if(!(formatoResult.toUpperCase().equalsIgnoreCase("PRETTY") || formatoResult.toUpperCase().equalsIgnoreCase("QUIET"))){
            System.out.println("Formato no aceptado. Las opciones posibles son: pretty o quiet.");
        }
	}
    	
    	private static String obtenerTipoFormato(String formato){
        	
        	String[] formatos = formato.split("=");
        	
        	return formatos[1];
        	
        }
    	
    	public void imprimirArchivoFactoresPrimos(String nombreArchivo, List<Integer> factoresPrimos, String orden){
    		
    		FileWriter archivo = null;
            PrintWriter pw = null;
            try{
                archivo = new FileWriter(nombreArchivo);
                pw = new PrintWriter(archivo);

                String formatoResult = obtenerTipoFormato(formato.getFormato());
               
                for (Integer elem : factoresPrimos) {
                   if (formatoResult.equalsIgnoreCase("pretty")){
                	   pw.print(elem + " ");   
                   }else{
                	   pw.println(elem);
                   }
                	 
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                   if (null != archivo)
                    archivo.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

    	}
    	
    	
        
    	public Formato getFormato() {
    		return formato;
    	}

    	public void setFormato(Formato formato) {
    		this.formato = formato;
    	}
        

}
