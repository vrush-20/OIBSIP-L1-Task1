//TASK2 Guessing The Number Game

//importing all the required libraries
import java.util.Scanner;
import java.lang.Math;

public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // use random() function to select random number between 1 and 50
        int number = (int) (Math.random() * 50) + 1;
        int guess;     //to take a guess from the user
        int trials = 3;//no of trials
        //int score=6;   //before starting the game we initialize the score to zero

        boolean correct = false;
        System.out.println("----Let's start the game----");
        System.out.println("Think of a number between 1 and 50.You have 3 chances to guess the correct number and win");

        while (trials > 0) {
            System.out.println("Enter a number of your choice");
            guess = sc.nextInt();   //the user enters his 1st guess

            // if the user guess is  correct,print that he has won
            if (guess == number)
            {
                System.out.println("You have guessed the right number!!You win this game!");
                //System.out.println("Your score is"+ score);
                System.out.println("You can try playing this game often.");
                break;
            }
            // if the user guesses the wrong number then reduce the number of chances
            else if (guess < number)
            {
                //if number is less
                System.out.println("OOPS!The number you entered is smaller than expected number.Please enter another number.");
                System.out.println("You have " + (trials - 1) + " guesses left.");

                //decrement then number of trials by 1
                trials--;
            }
            // if number is greater
            else
            {
                System.out.println("OOPS!The number you entered is greater than expected number.Please enter another number.");
                System.out.println("You have " + (trials - 1) + " quesses left.");
                // System.out.println("Your score is"+(score-4));

                //decrement number of trials
                trials--;
            }
        }
            if (correct == false)
            {
                System.out.println("Sorry!You ran out of tries.\nYou lose!");
                //System.out.println("Your score is"+ (score-score));
                System.out.println("Better luck next time!!");
            }
        // if the user has run out of trials, print the message and exit the program
        //to declare score based on number of tries
        //if user gets correct answer in first attempt his score is 15,it reduces by 5 for each wrong attempt

        if (trials ==1)
        {
            System.out.println("----Your score is 15----");
        }
        else if (trials == 2 )
        {
            System.out.println("----Your score is 10----");
        }
        else if (trials == 3) {
            System.out.println("----Your score is 5----");
        }
        else
        {
            System.out.println("----Your score is zero----");
            System.out.println("    :(     ");
        }

    }

}

