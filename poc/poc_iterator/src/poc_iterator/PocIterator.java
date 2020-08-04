package poc_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PocIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// TODO Auto-generated method stub

				//Lista debe tener los mismos objetos de un tipo de Clase
				// Interface obj = new Clase();
				List listClient = new ArrayList();
				
				Client client = new Client();
				client.setFirstName("Eduardo");
				client.setSecondName("Mendoza");
				
				listClient.add(client);
				
					
				Client newClient = new Client();
				newClient.setFirstName("Carlos");
				newClient.setSecondName("Fuentealba");
						
				listClient.add(newClient);
				
				
				client = new Client();
				client.setFirstName("Pablo");
				client.setSecondName("Mondaca");
				
				listClient.add(client);
							
			
				System.out.println("listClient:"+listClient);
				
				
				// Mostar los elementos de la lista
				
				
				Iterator it = listClient.listIterator();
				
				
				//Detectar que tipo de objeto tiene la lista
				/*Object obj = null;
				
				while (it.hasNext()) {
					
					// Casting JAVA
					obj = (Object) it.next();
					System.out.println("obj:"+obj);
					
				}*/
				
				Client nclient = null;
				
				while (it.hasNext()) {
					
					// Casting JAVA
					nclient = (Client) it.next();
					System.out.println("nclient:"+nclient);
					
					System.out.println("firstName:"+nclient.getFirstName());
					System.out.println("secondName:"+nclient.getSecondName());
					
				}
				
				

	}

}
