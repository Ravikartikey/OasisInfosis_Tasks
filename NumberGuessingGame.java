import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String args[]) {
        int guess1, countguess1 = 1;
        String player1;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randNumber = rand.nextInt(100)+1;
        System.out.println(randNumber);
        System.out.println("LETS PLAY THE GAME ");
        System.out.println("enter the player name");
        player1 = sc.nextLine();
        System.out.println("guess the number between 1 to 100");
    do {
        guess1 = sc.nextInt();
        if(guess1>randNumber){
            System.out.println("choose lower number pls!!");
        }
        else if(guess1<randNumber){
            System.out.println("choose higher number pls!!");
        }
        else{
            System.out.println("you guessed the correct number in "+countguess1+" attempt");
        }
        countguess1++;
    }while(guess1!=randNumber);
    if(countguess1>10){
        System.out.println("YOU LOSS!!!!");
    }
    else{
        System.out.println("YOU WINNER!!");
    }
    }
}