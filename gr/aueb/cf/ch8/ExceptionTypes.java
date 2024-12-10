package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {

    }


    //system.in.read() throws IOException  since a checked
    //exception in throw it has to be explicitly to be thrown in
    //method signature
    //Or ha to be caught {}
    //when this type of method / exception may be used
    //when no need to handle the exception

    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }


    //if we catch exception, no need for throws in method
    //signature and the exception not propagates
    //is it a good practise, not to propagate?
    //it depends if there is a caller then we have to propagate
    //if there is a client then we do not propagate to exception

    public static char readAnotherChar(){
        try {
            return (char) System.in.read();
        }catch (IOException e){
            System.err.println(e.getMessage());
            return ' ';
        }
    }


    //In this type of method we take action
    //--logging and also rethrow the exception
    //to propagate to the caller
    public static char readAnotherOne() throws IOException{
        try {
            return (char) System.in.read();
        }catch (IOException e){
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readAgainOne(char ch) throws IOException, IllegalArgumentException{
        try{
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IllegalArgumentException ex1){
            ex1.printStackTrace();
            System.err.println(ex1.getMessage());
            throw ex1;
        } catch (IOException ex2){
            ex2.printStackTrace();
            System.err.println(ex2.getMessage());
            throw ex2;
        }
    }
}
