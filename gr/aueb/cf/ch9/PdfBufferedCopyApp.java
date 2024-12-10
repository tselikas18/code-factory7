package gr.aueb.cf.ch9;

//copies pdf file

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfBufferedCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;
        byte[] buffer = new byte[8192];

        try (FileInputStream fis = new FileInputStream("C:/tmp/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-output.pdf")){

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1){
                fos.write(buffer,0,b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start)/1000.0;

            System.out.printf("File copied succefully (size: %.1fk(%d bytes))\n", (counter/1024.0), counter);
            System.out.println("elapsed time: " + elapsedTime + " seconds");
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
