package com.github.zipcodewilmington;
//Lydia Stone Konstanski
import java.util.*;
import java.util.Random;

//Declare Class
public class Hangman {
    //Declare variables
    static int strikeCounter = 0;
    static int maxStrike = 4;
    int correctLetters = 0;
    String playOrNot;
    String playerGuess;
    static String secretWord;
    static String userWord = "___";
    static String choiceToPlay;
    static String guess;
    static String[] wordList = {"ART", "BAR", "BAT", "BAN", "BIN", "BIT", "CAT", "DAD", "EAT", "EAR", "FUR", "FIT", "FAR",
            "FOX", "GET", "GEL", "HEM", "HIP", "HAS", "INK", "ILL", "ILK", "KIN", "KIT", "LIT", "LET", "LOP", "LAX",
            "MAT", "MIX", "MAX", "NOT", "NIT", "NET", "NIL", "ONE", "OAT", "OLD", "POT", "PAT", "PIT", "PAN", "QAT",
            "RAT", "RAN", "RAP", "RIP", "SUM", "SAT", "SIX", "SUN", "TON", "TIL", "TAN", "VAN", "VAT", "WIN", "WAN",
            "WAS", "YEN", "YIP", "YAP", "YES", "ZOO", "ZIP", "ZAP"};

    public static void main(String[] args) {


        if (noToPlay()){
         endGame();
            // End Game
        }

        getRandomWord();

        System.out.println("The secret word has 3 letters, and you get 4 strikes:");
        System.out.println("___");


        while (strikeCounter < maxStrike) {
            guessAgain();
            compareLettersInSecretWord();
            //if the character matches any letter in the secret word, call  displayKnownLetters();
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

    public static void endGame(){
        System.out.println("Fine, I didn't want to play with you anyway!");
        System.exit(0);
    }
    public static boolean noToPlay(){
        System.out.println("Hi, would you like to play Guess the Secret Word?");
        System.out.println("Type Y for yes or N for no");
        Scanner sc = new Scanner(System.in);
        choiceToPlay = sc.next();
        if (Objects.equals(choiceToPlay, "N") || Objects.equals(choiceToPlay, "n")){
            return true;
        } else return false;
    }
    public static void guessAgain(){
        System.out.println("Type your 1 letter guess");
        Scanner sc = new Scanner(System.in);
        guess = sc.next();
    }
    public static void getRandomWord(){
        secretWord = wordList[new Random().nextInt(wordList.length)];
    }
    public static void compareLettersInSecretWord(){
        for (int i = 0; i < secretWord.length(); i++) {
            char letter = secretWord.charAt(i);
            System.out.println(letter);
        }
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

