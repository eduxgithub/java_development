/*
 * 
 */
package cl.company.numbers.process;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import cl.company.numbers.process.domain.Person;

// TODO: Auto-generated Javadoc
/**
 * The Class ProcessNumbers.
 */
public class ProcessNumbers {

	//atributos de la clase
	
	/** The Constant CONFIG_LOG4J_PROPERTIES. */
	//final son constantes y se escriben en mayusculas
	private static final String CONFIG_LOG4J_PROPERTIES = "config/numbers-log4j.properties";
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(ProcessNumbers.class);
	
	/**
	 * Instantiates a new process numbers.
	 */
	//constructores
	public ProcessNumbers() {
		
		LOGGER.info("----------------------------------------");
		LOGGER.info("Init Class");	
		LOGGER.info("----------------------------------------");
		
		PropertyConfigurator.configure(CONFIG_LOG4J_PROPERTIES);
		
		
	}
	
	/**
	 * Instantiates a new process numbers.
	 *
	 * @param message the message
	 */
	public ProcessNumbers(String message) {
		
		LOGGER.info("----------------------------------------");
		LOGGER.info("Welcome " + message);	
		LOGGER.info("----------------------------------------");
		
	}
	
	//metodos
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		
		ProcessNumbers processNumbers = new ProcessNumbers();
		
			
		// TODO Auto-generated method stub

		LOGGER.info("----------------------------------------");
		LOGGER.info("Start Process - Process Numbers");
		LOGGER.info("----------------------------------------");
		
		
		//get command line
		String firstValue = args[0];
		String secondValue = args[1];
		String thirdValue = args[2];	
		String fourthValue = args[3];		
		
		processNumbers.sum(firstValue, secondValue, Integer.parseInt(thirdValue), Integer.parseInt(fourthValue));
		
		Person person = new Person();
		
		//ejemplo de invocacion a una clase del Proyecto
		person.setAge(firstValue);
		
	}
	
	
	/**
	 * Sum.
	 *
	 * @param firstNumber the first number
	 * @param secondNumber the second number
	 * @param thirdNumber the third number
	 * @param fourthNumber the fourth number
	 */
	private void sum(String firstNumber, String secondNumber, Integer thirdNumber, Integer fourthNumber) {
		
		
		LOGGER.info("First Number:"+firstNumber);
		LOGGER.info("Second Number:"+secondNumber);
		LOGGER.info("Third Number:"+thirdNumber);
		LOGGER.info("Fourth Number:"+fourthNumber);
		
		int sum = Integer.parseInt(firstNumber) +  Integer.parseInt(secondNumber) + thirdNumber.intValue() + fourthNumber.intValue();
		
		// comentarios funcional
		LOGGER.info("New Sum:"+sum);					
		LOGGER.info("New Sum - String:"+Integer.toString(sum));
		
		
	}

}
