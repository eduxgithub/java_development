package poc_inputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;

import java.net.URL;
import java.net.URLConnection;

public class PocInputStream {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        // InputStream initialStream;

        /*try {
            initialStream = new FileInputStream(new File("c:\\temp\\Certificate_Scrum_master.pdf"));

            byte[] buffer = new byte[initialStream.available()];

            initialStream.read(buffer);

            File         targetFile = new File("c:\\temp\\eduardo_scrum.pdf");
            OutputStream outStream  = new FileOutputStream(targetFile);

            outStream.write(buffer);
        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        try {
            URL            oracle        = new URL("https://www.oracle.com/index.html");
            URLConnection  conn          = oracle.openConnection();
            BufferedReader initialStream = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            FileWriter     targetFile    = new FileWriter("c:\\temp\\test.html");
            BufferedWriter outStream     = new BufferedWriter(targetFile);
            String inputLine;

            while ((inputLine = initialStream.readLine()) != null) {
                outStream.write(inputLine + System.getProperty("line.separator"));
            }

            initialStream.close();
            outStream.close();
            System.out.println("DONE");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
