import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task1 { 
    
    static Random random = new Random();
   
    
    public static void main(String[] args) throws Exception {

        System.out.println( "\nThe program creates a text file numbers.csv and fills it with a sequence of 100 random integers from 1 to 100, the numbers are separated by commas." );
        
        //Writing random numbers to a file
        FileWriter textWrite = new FileWriter ("numbers.txt");
        for (int i = 0; i < 100; i++){
            int randomNumbers = random.nextInt(100);
            textWrite.write (String.valueOf(randomNumbers));
            if (i<99) textWrite.write (",\n");
        }
        textWrite.close();

        //Outputting a file to the console
        FileReader textReader = new FileReader ("numbers.txt");
        Scanner in = new Scanner (textReader);

        int i = 0;
        System.out.print( "\nRandom numbers from file:" );
        while ( in.hasNextLine() ){
            System.out.print( in.nextLine() );
            i++;

        }
        textReader.close();
    }
    
}

