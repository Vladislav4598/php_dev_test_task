import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Task2 { 
    
    public static void main(String[] args) throws Exception {

        System.out.println( "\nThe program reads the numbers.csv file created by the first program and sorts the numbers from lowest to highest sorting method. The program displays the result on the screen. " );
       
        //Read file
        FileReader textReader = new FileReader ("numbers.txt");
        Scanner in = new Scanner (textReader);
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Saving data from a file to a list
        int i = 0;
        String str = "";
        System.out.print( "\nRandom numbers from file: " );
        while ( in.hasNextLine() ){
            str = in.nextLine().replace(",", "");
            System.out.print(str + ", ");
            list.add(Integer.parseInt(str));
            i++;
        }
        textReader.close();  
        in.close();

        //Sort
        for (i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if ( list.get(i) < list.get(j) ) list.set( i, list.set( j, list.get(i) ) );
            }
        }

        //Output Sorting
        System.out.print( "\n\nSort random numbers from file: " );
        for (i = 0; i < list.size(); i++) {
            System.out.print( list.get(i) ) ;
            if (  i != list.size() - 1   )
            System.out.print( ", " );
            else 
            System.out.print( "." );   
        }
    }
}
