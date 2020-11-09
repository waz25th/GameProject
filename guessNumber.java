import java.util.Scanner; // allows for user input
public class guessNumber{
    public static void main (String[] args){
        int randomNumber = (int) (Math.random() * 999 + 1); // this sets the random number to any number between 1 and 999

        Scanner userInput = new Scanner(System.in); // here is where user input will be prompted
        int guess; // create a variable called guess
        
        do{
        System.out.println(" guess the random number");
        guess = userInput.nextInt(); // assign the value of guess as the user input

        System.out.println("The number you guessed is: " + " " + guess);

        if(guess <= 0 || guess >999){
            System.out.println("Please input valid integer");
        }

        else if(guess == randomNumber){
            System.out.println("Congratulations, you were accurate with your guessing");
        }
        else if (guess > randomNumber){
            System.out.println("This is too high, try a lower number.");
        
        }

                else if( guess < randomNumber){
            System.out.println("Your guess is too low, aim higher");
        } 
    } while (guess != randomNumber);
 
        
    }
}