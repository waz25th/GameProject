
import java.util.Scanner; // this helps with user input 

public class guessNumber{
    // create a new scanner object called userInput
    // by calling new and passing the Scanner constructor the scanner object is created
    static Scanner userInput = new Scanner(System.in); 

    public static void main(String [] args){
        System.out.print("enter a number: ");

        if (userInput.hasNextInt()){ // if statement
            int numberEntered = userInput.nextInt();
            System.out.println("you entered:" + numberEntered);

        int randomNumber = (int) (Math.random() * 101); // this will return a random number between 0 and 25
            System.out.println(randomNumber + " is the Random Number");

    
    }

    if (userInput.hasNextInt()){
        
        System.out.println(" congratulations, you guessed the correct number");

    }
    else {
        System.out.println("wrong guess, try again");
    }
    
    }
}
