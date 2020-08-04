package poc_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PocProperties {
	
	
    private static final String FILE_NAME_CONFIG = "config/config.properties";
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties  props = null;

	      try {
	           
	            FileInputStream fis = new FileInputStream(FILE_NAME_CONFIG);
	           
	            props = new Properties();
	            props.load(fis);
	            
	            
	            String limitInf = props.getProperty("limite_inferior");
	            System.out.println("limite inferior:"+ limitInf);

	            String limitSup = props.getProperty("limite_superior");
	            System.out.println("limite superior:"+ limitSup);
	           
	        }  catch (IOException ioe) {
	        	
	        	ioe.printStackTrace();
	        }
	      
	        Properties nProps = new Properties();
	        
	        nProps.setProperty("stream_favorito", "netflix");	        
	        nProps.setProperty("comida_favorita", "lomo al palo");
	        
	        String streamFavorito = nProps.getProperty("stream_favorito");
	        System.out.println("stream_favorito:"+ streamFavorito);
	        
		
	}

}
