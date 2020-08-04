package poc_stringBuffer;

public class PocStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Caso mas utilizado
		
		int age = 25;
		
		// StringBuffer vs String
		
		//String 
		//String querySql = new String();
		//querySql.concat("Select fisrtName, secondName from Client where ");
		//querySql.concat("age = "+Integer.toString(age));	
		
		//String queryFinal = querySql.concat("Select fisrtName, secondName from Client where ").concat("age = "+Integer.toString(age));
		
		// StringBuffer
		String querySql = new String();
		StringBuffer sbf = new StringBuffer();
		sbf.append("Select fisrtName, secondName from Client where ");
		sbf.append("age = "+Integer.toString(age));
		
		querySql = sbf.toString();
		System.out.println(querySql);
		
		

	}

}
