package com.github.zipcodewilmington;
//Lydia Stone Konstanski
import java.util.*;

//Declare Class
public class Hangman {
    //Declare variables
    int strikeCounter = 0;
    int correctLetters = 0;
    String playOrNot;
    String playerGuess;
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

    public static void getRandomWord(){
        // Build this later
    }
}






/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
}
