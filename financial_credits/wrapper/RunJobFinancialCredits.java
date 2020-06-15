package com.everis.financial.wrapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.everis.financial.business.JobFinancialCredits;
import com.everis.financial.domain.Car;
import com.everis.financial.domain.Client;
import com.everis.financial.domain.SalesRequest;
import com.everis.financial.domain.Salesman;
import com.everis.financial.util.Util;

//TODO: Auto-generated Javadoc

/**
 * The Class RunJobFinancialCredits.
 */
public class RunJobFinancialCredits {

    /** The Constant CONFIG_LOG4J_PROPERTIES. */
    private static final String CONFIG_LOG4J_PROPERTIES = "config/financial_credits-log4j.properties";

    /** The Constant LOGGER. */
    private static final Logger LOGGER           = Logger.getLogger(RunJobFinancialCredits.class);
    private Salesman            salesman         = null;
    private Client              client           = null;
    private Car                 car              = null;
    private SalesRequest        salesRequest     = null;
    private List<Salesman>      listSalesman     = new ArrayList<Salesman>();
    private List<Client>        listClient       = new ArrayList<Client>();
    private List<Car>           listCar          = new ArrayList<Car>();
    private List<SalesRequest>  listSalesRequest = new ArrayList<SalesRequest>();

    /**
     * Instantiates a new run job financial credits.
     */
    public RunJobFinancialCredits() {}

    /**
     * Execute.
     *
     * @return the string
     */
    public String execute() {

        // JobFinancialCredits jobFinancialCredits = new JobFinancialCredits();
        // jobFinancialCredits.getSalesRequest(salesman, client, null);
        // TODO
        return "";
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        PropertyConfigurator.configure(CONFIG_LOG4J_PROPERTIES);
        LOGGER.info("----------------------------------------");
        LOGGER.info("Start Process - Financial Credits");
        LOGGER.info("----------------------------------------");

        RunJobFinancialCredits runJobFinancialCredits = new RunJobFinancialCredits();

        runJobFinancialCredits.getGeneralMenu();
        runJobFinancialCredits.execute();
    }

    /**
     * Gets the general menu.
     *
     * @return the general menu
     */
    private void getGeneralMenu() {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        boolean        exit       = false;

        while (!exit) {
            try {
                System.out.println("-------------------------------------------------------------");
                System.out.println("                       MENU                                  ");
                System.out.println("1. Ingreso Datos Vendedor");
                System.out.println("2. Ingreso Datos Cliente");
                System.out.println("3. Ingreso Datos Vehiculo");
                System.out.println("4. Generar Cotizacion");
                System.out.println("5. Generar Reporte");
                System.out.println("6. Salir");
                System.out.println("   Opcion:");
                System.out.println("-------------------------------------------------------------");

                String option = bufferRead.readLine();

                switch (Integer.parseInt(option)) {
                case 1 :
                    salesman = new Salesman();
                    System.out.println("Ingrese nombre: ");
                    salesman.setFirstName(bufferRead.readLine());
                    System.out.println("Ingrese apellido: ");
                    salesman.setLastName(bufferRead.readLine());
                    System.out.println("Ingrese tipo vendedor: ");
                    this.getSalesmanMenu();
                    listSalesman.add(salesman);
                    
                    break;

                case 2 :
                    client = new Client();
                    System.out.println("Ingrese nombre: ");
                    client.setFirstName(bufferRead.readLine());
                    System.out.println("Ingrese apellido: ");
                    client.setLastName(bufferRead.readLine());
                    System.out.println("Ingrese rut: ");
                    client.setRut(bufferRead.readLine());
                    System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy): ");
                    client.setBirthDate(bufferRead.readLine());
                    System.out.println("Ingrese Nacionalidad: ");
                    client.setNationality(bufferRead.readLine());
                    System.out.println("Ingrese direccion particular: ");
                    client.setAddress(bufferRead.readLine());
                    System.out.println("Ingrese numero telefonico: ");
                    client.setPhoneNumber(bufferRead.readLine());
                    System.out.println("Ingrese ocupacion : ");
                    client.setJob(bufferRead.readLine());
                    listClient.add(client);

                    break;

                case 3 :
                    car = new Car();
                    System.out.println("Ingrese tipo de carroceria: ");
                    car.setBodyType(bufferRead.readLine());
                    System.out.println("Ingrese marca: ");
                    car.setMake(bufferRead.readLine());
                    System.out.println("Ingrese modelo: ");
                    car.setModel(bufferRead.readLine());
                    System.out.println("Ingrese precio: ");
                    car.setPrice(bufferRead.readLine());
                    listCar.add(car);

                    break;

                case 4 :
                	String idSalesman = null;
                	String optionCar;
                	int indexClient=-1; int indexSalesman=-1;             	
                	
                	do {
                		System.out.println("Ingrese ID de vendedor. Si necesita ver su ID presione 1... ");
                		idSalesman=bufferRead.readLine();
                		if(idSalesman.equals("1")){
                			showListSalesman(listSalesman);
                			Thread.sleep(3000);
                		}
                		else {
                			indexSalesman=findIndexSalesman(listSalesman, idSalesman);
                			if (indexSalesman==-1) {
    	                    	System.out.println("Vendedor no encontrado. Favor ingrese nuevamente.");
    	                    	Thread.sleep(3000);
    	                    }
                		}
                	}while(idSalesman.equals("1") || indexSalesman==-1);
                	
                	do {
	                	System.out.println("Ingrese nombre cliente: ");
	                    String nameClient=bufferRead.readLine();
	                    System.out.println("Ingrese apellido cliente: ");
	                    String lastNameClient=bufferRead.readLine();
	                    indexClient=findIndexClient(listClient, nameClient, lastNameClient);
	                    if (indexClient==-1) {
	                    	System.out.println("Cliente no encontrado. Favor ingrese nuevamente.");
	                    	Thread.sleep(3000);
	                    }
                	}while(indexClient==-1);
                    
                	do {
                		showListCar(listCar);
                		System.out.println("Ingrese opción válida: ");
                        optionCar = bufferRead.readLine();
                	}while(Integer.parseInt(optionCar)<=0 || Integer.parseInt(optionCar)>listCar.size());
                	
                	salesRequest = new SalesRequest();
                    salesRequest.setDataSalesman(listSalesman.get(indexSalesman));
                    salesRequest.setDataClient(listClient.get(indexClient));
                    salesRequest.setDataCar(listCar.get(Integer.parseInt(optionCar)-1));
                    Date fecha = new Date();
                    String strDateFormat = "dd-MMM-YYYY hh:mm:ss a"; // El formato de fecha está especificado  
                    SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto
                    salesRequest.setDate(objSDF.format(fecha));
                   // salesRequest.setDate(Util.getDate(fecha,"dd/mm/yyyy", 0));    // Util.getDate(date, dateFormat, postDay)
                    System.out.println("--------------------------");
                    System.out.println("       COTIZACION         ");
                    System.out.println();
                    System.out.println("Vendedor:" + salesRequest.getDataSalesman().getFirstName() + " "
                                       + salesRequest.getDataSalesman().getLastName());
                    System.out.println("Cliente:" + salesRequest.getDataClient().getFirstName() + " "
                                       + salesRequest.getDataClient().getLastName());
                    System.out.println("Auto:");
                    System.out.println("Tipo:" + salesRequest.getDataCar().getBodyType());
                    System.out.println("Marca:" + salesRequest.getDataCar().getMake());
                    System.out.println("Modelo:" + salesRequest.getDataCar().getModel());
                    System.out.println("Precio:" + salesRequest.getDataCar().getPrice());
                    System.out.println();
                    System.out.println("Fecha cotizacion:" + salesRequest.getDate());
                    listSalesRequest.add(salesRequest);
                    System.out.println("--------------------------");
                    Thread.sleep(5000);
                    
                    break;

                case 5 :
                	
                    BufferedWriter writer;
                    String nameClient=null; String lastNameClient=null;
                    indexClient=-1;
                    
                	do {
	                	System.out.println("Ingrese nombre cliente: ");
	                    nameClient=bufferRead.readLine();
	                    System.out.println("Ingrese apellido cliente: ");
	                    lastNameClient=bufferRead.readLine();
	                    indexClient=findIndexClient(listClient, nameClient, lastNameClient);
	                    if (indexClient==-1) {
	                    	System.out.println("Cliente no encontrado. Favor ingrese nuevamente.");
	                    	Thread.sleep(3000);
	                    }
                	}while(indexClient==-1);
                	
                	File fileName = new File("C:\\home\\emendoza\\projects\\java\\eclipse-workspace\\financial_credits\\Reporte_"+nameClient+"_"+lastNameClient+".txt");
                	writer = new BufferedWriter(new FileWriter(fileName));
                	writer.append(" ------ REPORTE FINANCIERO ------- \n");
                	writer.append("\n");
                	writer.append("\n");
                	writer.append("Nombre Cliente: "+listSalesRequest.get(indexClient).getDataClient().getFirstName()+" "+listSalesRequest.get(indexClient).getDataClient().getLastName()+"\n");
                	writer.append("RUT: "+listSalesRequest.get(indexClient).getDataClient().getRut()+"\n");
                	writer.append("Fecha Nacimiento: "+listSalesRequest.get(indexClient).getDataClient().getBirthDate()+"\n");
                	writer.append("Dirección: "+listSalesRequest.get(indexClient).getDataClient().getAddress()+"\n");
                	writer.append("Ocupación: "+listSalesRequest.get(indexClient).getDataClient().getJob()+"\n");
                	writer.append("Nacionalidad: "+listSalesRequest.get(indexClient).getDataClient().getNationality()+"\n");
                	writer.append("Teléfono: "+listSalesRequest.get(indexClient).getDataClient().getPhoneNumber()+"\n");
                	writer.append("\n");
                	writer.append("\n");
                	writer.append("Cotización de autos:\n");
                	writer.append("\n");
                	for(int i=0;i<listSalesRequest.size();i++) {
                		if(nameClient.equals(listSalesRequest.get(i).getDataClient().getFirstName()) && lastNameClient.equals(listSalesRequest.get(i).getDataClient().getLastName())){
                			writer.append("Vendedor: "+listSalesRequest.get(i).getDataSalesman().getFirstName()+" "+listSalesRequest.get(i).getDataSalesman().getLastName()+"\n");
                			writer.append("\n");
                			writer.append("Tipo: " + listSalesRequest.get(i).getDataCar().getBodyType() + "\n");
                			writer.append("Marca: " + listSalesRequest.get(i).getDataCar().getMake() + "\n");
                			writer.append("Modelo: " + listSalesRequest.get(i).getDataCar().getModel() + "\n");
                			writer.append("Precio: " + listSalesRequest.get(i).getDataCar().getPrice() +  "\n");
                		}
                		writer.append("\n");
                		writer.append("\n");
                	}
                	writer.append("------------------------------------------\n");
                	writer.close();
                    
                    break;

                case 6 :
                    exit = true;
                    System.out.println("Muchas gracias...");
                    Thread.sleep(2000);

                    break;

                default :
                    System.out.println("Opción incorrecta. Ingrese nuevamente...");
                    Thread.sleep(3000);
                }
            } catch (IOException e) {

                // TODO Auto-generated catch block
                System.out.println("Error capturado");
                LOGGER.error(Util.getStackTrace(e));
            } catch (NumberFormatException ne) {

                // TODO Auto-generated catch block
                System.out.println("Error numerico capturado");
                LOGGER.error(Util.getStackTrace(ne));
            } catch (Exception e) {
                LOGGER.error(Util.getStackTrace(e));
            }
        }

        System.out.println("FIN.");
    }

	/**
     * Gets the salesman menu.
     *
     * @return the salesman menu
     */
    private void getSalesmanMenu() {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        boolean        exit       = false;

        while (!exit) {
            try {
                System.out.println("-------------------------------------------------------------");
                System.out.println(" TIPO VENDEDOR");
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ingrese 1 para vendedor minorista / Ingrese 2 para vendedor mayorista: ");

                String optionSales = bufferRead.readLine();
                
                switch(Integer.parseInt(optionSales)) {
                
                case 1:
                	salesman.setType("Minorista");
                    System.out.println("Se ha ingresado vendedor minorista satisfactoriamente...");
                    exit=true;
                    Thread.sleep(3000);
                	break;
                	
                case 2:
                	salesman.setType("Mayorista");
                    System.out.println("Se ha ingresado vendedor mayorista satisfactoriamente...");
                    exit=true;
                    Thread.sleep(3000);
                	break;
                	
                default:
                	System.out.println("Opción incorrecta. Ingrese nuevamente...");
                    Thread.sleep(3000);
                	break;
                
                }
            } catch (IOException e) {
            	System.out.println("Error capturado");
                LOGGER.error(Util.getStackTrace(e));
                e.printStackTrace();
            } catch (InterruptedException e) {
				// TODO Auto-generated catch block
            	System.out.println("Error de Interrupción capturado");
                LOGGER.error(Util.getStackTrace(e));
				e.printStackTrace();
			}
        }
    }
    
    private void showListSalesman(List<Salesman> listSalesman) {
    	System.out.println("Lista de Vendedores:");
    	System.out.println();
    	for(int i=0; i<listSalesman.size();i++) {
    		System.out.println("ID vendedor: "+listSalesman.get(i).getCode()+" || Nombre Vendedor: "+listSalesman.get(i).getFirstName()+" "+listSalesman.get(i).getLastName()+" || Tipo Vendedor: "+listSalesman.get(i).getType());
    	}
    	System.out.println();
    	System.out.println("--------------------------");
    	System.out.println();
    }
    
    private int findIndexClient(List<Client> listClient, String nameClient, String lastNameClient ) { 	
    	for(int i=0;i<listClient.size();i++) {
        	if(nameClient.equals(listClient.get(i).getFirstName())&&lastNameClient.equals(listClient.get(i).getLastName())) {
        		return i;
        	}
    	}
    	
    	return -1;
    }
    
    private int findIndexSalesman(List<Salesman> listSalesman, String idSalesman) {
    	for(int i=0;i<listSalesman.size();i++) {
        	if(Integer.parseInt(idSalesman)==listSalesman.get(i).getCode()){
        		return i;
        	}
    	}
    	
    	return -1;
	}
    
    private void showListCar(List<Car> listCar) {
    	System.out.println("Lista de Vehículos:");
    	System.out.println();
    	for(int i=0; i<listCar.size();i++) {
    		int j=i+1;
    		System.out.println(j + " || " + listCar.get(i).getMake() + " || " + listCar.get(i).getModel() + " || " + listCar.get(i).getBodyType() + " || " + listCar.get(i).getPrice());
    	}
    	System.out.println();
    	System.out.println("--------------------------");
    	System.out.println();
    }
    
}


//~ Formatted by Jindent --- http://www.jindent.com
