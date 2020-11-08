import javax.swing.*; // import java swing

public class GuessingGame {
    public static void main(String[] args){
        int randomNumber = (int) (Math.random() * 100 + 1); // assign a random value to the int value random number

        int userAnswer = 0;

        System.out.println(" the correct answer would be" + randomNumber);

        int count = 1;

        while (userAnswer != randomNumber){
            String response = JOptionPane.showInputDialog(null, " Guess a random number between 1 and 100", " Guessing Game", 3 ); 
            // JOptionPane creates a pop up dialog box
            // after using the method showInputDialog, what is to be followed is a component (null) and two objects
            // the number after the last object dictates what image the dialog box will have (!, "x " or ?)
            userAnswer = Integer.parseInt(response);// parses a string and returns an integer
            JOptionPane.showMessageDialog(null, " " + determineGuess(userAnswer, randomNumber, count));
            count++; // count tells the user how many times they have tried, with the increment operator allowing for the number to rise

        }
    }

    public static String determineGuess(int userAnswer, int randomNumber, int count){ // constructor method
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == randomNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > randomNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < randomNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
