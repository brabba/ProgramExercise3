
import java.util.Random;
import java.util.*;
import java.util.Scanner;
public class ProgramExercise3 {
  public static void main(String[] args) {
    int min = 1; 
    int max = 10000; 
    int guesses = 0; 
    //Used to generate random number using Random java library
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    
    Scanner num = new Scanner(System.in);
    while(true)
    {
      System.out.print("Enter a guess between " + min + " and " + max + ": ");
      int userInput = num.nextInt();
	  //is user number is higher tell user to guess lower
      if(userInput > randomNum)
      {
        System.out.println("LOWER"); 
        guesses++; 
      }
      //if user number is lower tell user to guess higher
      else if(userInput < randomNum)
      {
        System.out.println("HIGHER"); 
        guesses++; 
      }
      //when number is guessed output number of guesses
      else
      {
        System.out.println("You WIN. It took you " + guesses + " guesses"); 
        break; 
      }
    }
  
  }
  
}
