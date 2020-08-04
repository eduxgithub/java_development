package poc_hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PocHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap almacena key = value (a nivel de objetos/estructuras)
		
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
		
		Car car = new Car();
		car.setModel("F-150");
		
		Map mapReportFinancial = new HashMap();
		
		mapReportFinancial.put("listClient", listClient);
		mapReportFinancial.put("car", car);
		System.out.println("mapReportFinancial:"+mapReportFinancial);

	}
}
