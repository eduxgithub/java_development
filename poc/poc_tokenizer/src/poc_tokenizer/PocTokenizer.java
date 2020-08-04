package poc_tokenizer;

import java.util.StringTokenizer;

public class PocTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a;b;c;d;e
		//eduardo;pedro;juan;marcelo //key string separator char
		
		//String DELIM = ";";
		String DELIM = "&";
		//String listNames = "eduardo;pedro;juan;marcelo&carlos;fernando;";
		String url = "nombre=eduardo&sexo=masculino&edad=31";
		System.out.println("url:" + url);
		
		StringTokenizer str = new StringTokenizer(url, DELIM);

		 /* String result = str.nextToken();
		 System.out.println("result:" + result);
		 System.out.println("result 2:" + str.nextToken());
		 System.out.println("result 3:" + str.nextToken());
		 System.out.println("result 4:" + str.nextToken());
		
		 System.out.println("result 5:" + str.nextToken());*/
		
				
		 while (str.hasMoreTokens()) {
			 
			 
	         System.out.println(str.nextToken());
	     }
		 
		 
		 
		 
		 
		 

	}

}
