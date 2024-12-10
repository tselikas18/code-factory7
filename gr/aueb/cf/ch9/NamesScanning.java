package gr.aueb.cf.ch9;

//διαβαζει απο ενα αρχειο δεδομενα

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class NamesScanning {

    public static void main(String[] args) {
        String inFilePath = "C:/tmp/names.txt";
        String outFilePath = "C:/tmp/names-formated.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
            PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)){

            while ((line = reader.readLine()) != null){
                tokens = line.split(",+\\s*");
                //ps.printf("{\"Firstname\": \"%s\", \"lastname\": \"%s\:, \"City\": \"%s\"},\n", tokens[0], tokens[1], tokens[2]);
                printFormated(ps, tokens);
                printFormated(System.out, tokens);
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void printFormated(PrintStream ps, String[] tokens){
        ps.printf("{\"Firstname\": \"%s\", \"lastname\": \"%s\":, \"City\": \"%s\"},\n", tokens[0], tokens[1], tokens[2]);
    }
}
