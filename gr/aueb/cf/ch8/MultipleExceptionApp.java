package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionApp {

    public static void main(String[] args) throws IOException{
        File file = new File("c:/tmp/file.txt");

        try (Scanner in = new Scanner(file)){
            char ch = (char) System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
            throw e;
        } catch (IOException e){
            System.err.println("IO exception");
            throw e;
        }
    }
}
