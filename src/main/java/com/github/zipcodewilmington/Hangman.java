package com.github.zipcodewilmington;
//Lydia Stone Konstanski
import java.util.*;

//Declare Class
public class Hangman {
    //Declare variables
    int strikeCounter = 0;
    int maxStrike = 5;
    int correctLetters = 0;
    String playOrNot;
    String playerGuess;
    String secretWord;
    char menuChoice;
    char letter;
    String[] wordList = {"ART", "BAR", "BAT", "BAN", "BIN", "BIT", "CAT", "DAD", "EAT", "EAR", "FUR", "FIT", "FAR",
            "FOX", "GET", "GEL", "HEM", "HIP", "HAS", "INK", "ILL", "ILK", "KIN", "KIT", "LIT", "LET", "LOP", "LAX",
            "MAT", "MIX", "MAX", "NOT", "NIT", "NET", "NIL", "ONE", "OAT", "OLD", "POT", "PAT", "PIT", "PAN", "QAT",
            "RAT", "RAN", "RAP", "RIP", "SUM", "SAT", "SIX", "SUN", "TON", "TIL", "TAN", "VAN", "VAT", "WIN", "WAN",
            "WAS", "YEN", "YIP", "YAP", "YES", "ZOO", "ZIP", "ZAP"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (endGame()){
            // End Game
        }

        getRandomWord();
        //getRandomWord method

        displayKnownLetters();
        //shows underscores or correct letters
        //System.out.println()


        while (strikeCounter < maxStrike) {
            guessAgain();
            compareLettersInSecretWord();
            //if the character matches any letter in the secret word, call displayKnownLetter.
            if (checkWinTheGame()) {
                wonTheGameMessage();
                //Do something
            }
            //if the letters are all guessed, return wonTheGameMessage
            //else strikeCounter++
            //

        }
        resolveLoss();

    }//Build Methods
    System.out.println("Let's play Word Guess 1.0!");
    {
        System.out.println("Do you want to play? Press Y/N\n");
        choiceToPlay = sc.next();
    }

    public static boolean endGame(){
        // Build This later.
        return false;
    }
    public static void guessAgain(){
        //Build this later
    }
    public static void getRandomWord(){
        // Build this later
    }
    public static void compareLettersInSecretWord(){
        //Build this later
    }
    public static void displayKnownLetters(){
        //Build this later
    }
    public static boolean checkWinTheGame(){
        return true;
    }
    public static void wonTheGameMessage(){
        //Print "Well done! You won!"
    }
    public static void resolveLoss() {
        //Print "Too bad. Better luck next time!"
    }
}






/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
}
