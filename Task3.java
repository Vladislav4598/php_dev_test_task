import java.util.Scanner;

public class Task3 {

    static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println( "\nWrite a program that raises a number to a power. The number and degree are set by the user when starting the program. The entered number is any integer from 1 to 10, the degree is any integer from 0 to 9. The result is displayed on the screen. For exponentiation, do not use a standard function of the programming language you are using." );

        //Input 
        boolean check = false;
        while ( check == false ){
            
            System.out.print("\nEnter number of 1 to 10: ");
            int number = in.nextInt();

            System.out.print("\nEnter power of 0 to 9: ");
            int power = in.nextInt();
            
            ////Input validation
            if  (number < 1 || power < 0 || number > 10  || power > 9 ) System.out.println("\nData entered incorrectly");
            //exponentiation and inference
            else {

                long finalNumber = 1;
                for (int i = 1; i < power + 1; i++) finalNumber *= number; 
        
                System.out.print("\n" + number + "^"+ power + " = " + finalNumber);
                check = true;

            }
        }
    }
    
}
