import java.util.Scanner;

public class Task4 {
    
    static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println( "\nThe user passes the phrase to the program at the entrance. The program should determine if the phrase is a palindrome and display the result on the screen." );

        // Input processing
        System.out.print("\nEnter the phrase: ");
        String strUser = in.nextLine().trim();
        String checkStrUser = "";
        boolean palindrome = false;
        int lineSize = strUser.length();
        
        //Eliminate white space for easy character comparison
        for (int i = 0; i < lineSize; i++){
            if ( strUser.charAt(i) != ' ' ) checkStrUser += strUser.charAt(i);
        }
        
        //Palindromicity check
        lineSize = checkStrUser.length();
        checkStrUser = checkStrUser.toLowerCase();
        for (int i = 0; i < lineSize - 1; i++){
            if ( checkStrUser.charAt(i) == checkStrUser.charAt(lineSize - 1 - i) )
                    palindrome = true;
             else{
                palindrome = false;
                break;
             }
        }
         
       // Output
        if (palindrome == true)  System.out.print( "\nThe phrase is a palindrome: " + strUser);
        else  System.out.print( "\nThe phrase not is a palindrome!!! " );
    }
    
}
