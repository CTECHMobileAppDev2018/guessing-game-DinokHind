import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Welcome to the guessing game.");
        
        //creates a random integer 0-99 and adds 1 to make it 1-100
        int randNum = rand.nextInt(100) + 1;
        
        //sets number of guesses to 0
        int numGuesses = 0;
        
        //set number to unguessed
        String numberGuessed = "False";
        //while loop
        while(numberGuessed == "False"){
          //Adds 1 to number of guesses
          numGuesses += 1;
            
          //taking user input
          System.out.println("What is your guess?");
          int guess = input.nextInt();
          input.close();
          
          //checking for match
          //if guess is correct
          if(guess == randNum){
            numberGuessed = "True";
          } else if(guess > randNum){
            System.out.println("Almost there! Guess lower.");
          } else if(guess < randNum){
            System.out.println("So close! Try a little higher.");
          }
        }
        
        //print results
        System.out.println("Good job. It took you " + numGuesses + " guesses.");
    
    }

}
