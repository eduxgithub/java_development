package poc_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PocFile {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        // Files nos sirve para almacenar informaci{on de acceso (texto)
        // crear un archivo
        // file name (path)

       
          String     str = "POC File Writer\n";
          BufferedWriter writer;
          File fileName = new File("c:\\temp\\test2_writer.txt");
         
          try {
            //writer = new BufferedWriter(new FileWriter("c:\\temp\\test_writer.txt"));
         
                /*if (fileName.setReadOnly()) {
                        System.out.println("Es posible setearlo - no esta como solo lectura");
                } else {
                        System.out.println("No Es posible setearlo - esta como solo lectura");
                }*/
         
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(str+"\n");
            writer.append('a');
            writer.append("\nxxxxxxxxxxxxxxxxxxxxxx\n");
            writer.append("yyyyyyyyyyyyyyyyyyyyyy\n");
            writer.close();
         
         
         
          } catch (IOException e) {
         
                System.out.println("Error de lectura de archivo");
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        
        /*BufferedReader bfr = null;

        try {
            String fileLine;

            bfr = new BufferedReader(new FileReader("c:\\temp\\test_reader.txt"));

            while ((fileLine = bfr.readLine()) != null) {
                System.out.println(fileLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Archivo no encontrado...");
            
        }catch (IOException e) {
            e.printStackTrace();
            
        }finally {
            try {
                if (bfr != null) {
                    bfr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }*/
                
        
        //control normal
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
