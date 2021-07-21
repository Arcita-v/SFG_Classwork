package j.ruso.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cbrec
 */
public class RockPaperScissors {

    public static void main(String[] args) {

        int plays = 0;
        int maxPlays = 0;

        int playerMove;
        int computerMove = 0;
        int totalTies;
        int totalWins;
        int totalLosses;
        String y = "";

        Scanner sc = new Scanner(System.in);
//insert while when player requests a new game and initiate variables
        do {
            totalTies = 0;
            totalWins = 0;
            totalLosses = 0;

//program asks user how many rounds to play  
            while (true) {
                System.out.println("How many rounds do you want to play?");
                maxPlays = sc.nextInt();
                sc.nextLine();
                if (maxPlays >= 1 && maxPlays <= 10) {
                    break; //ends loop if true  
                }
                System.out.println("Please pick a number between one and 10");

            }

            //play until last play is used
            while (maxPlays > 0) {
                //Computer aks user for choice of rock paper scissors
                System.out.println("please enter your move : 1. Rock, 2. Paper, 3. Scissors");
                playerMove = sc.nextInt();
                maxPlays -= 1;
                sc.nextLine();
                computerMove = ChooseRN();
                System.out.println("The computer chooses: " + computerMove);

                // Determine the winner  and keep track of wins and ties
                if (playerMove == computerMove) {
                    System.out.println("It's a tie");
                    totalTies++;
                } //-------------
                else if (playerMove == 1) {
                    if (computerMove == 2) {
                        System.out.println("Paper beats Rock . You lose!");
                        totalLosses++;
                    } else if (computerMove == 3) {
                        System.out.println("Rock Beats Scissors. You win!");
                        totalWins++;
                    }
                } //-------------
                else if (playerMove == 2) {
                    if (computerMove == 1) {
                        System.out.println("Paper beats Rock. You Win!");
                        totalWins++;
                    } else if (computerMove == 3) {
                        System.out.println("Scissors beat paper. You lose!");
                        totalLosses++;
                    }
                } //--------------
                else if (playerMove == 3) {
                    if (computerMove == 1) {
                        System.out.println("Rock beat Scissors. You lose!");
                        totalLosses++;
                    } else if (computerMove == 2) {
                        System.out.println("Scissors beat Paper. You win!");
                        totalWins++;
                    }
                }
                //keep track of games played
                plays++;
            }

            //display stats keep track of ties wins and losses 3 vars to keep track
            System.out.println("You Played: " + plays + " Games; tied : " + totalTies + " Lost: " + totalLosses + " and Won: " + totalWins + ".");

            //declare overall winner on who won the most rounds
            if (totalWins > totalLosses) {
                System.out.println("You are the overall winner");
            } else if (totalLosses > totalWins) {
                System.out.println("Computer is the overall winner");
            } else {
                System.out.println("It's a tie");
            }

            //ask player if they want to play again
            //if yes loop to start of game
            //Playes does not want to play - print " Thanks for playing!"
            System.out.println("Do you want to play again?  yes  no ");
            y = sc.nextLine();
        } while (y.equals("yes"));
        System.out.println("Thanks for playing");
    }

    //method to call random number 
    public static int ChooseRN() {
        Random computerMove = new Random();
        return computerMove.nextInt(3) + 1;
    }
}
