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
            displayKnownLetters();
            checkWinTheGame();
        }
        resolveLoss();

    }//Build Methods

    public static void endGame(){
        System.out.println("Fine, I didn't want to play with you anyway!");
        System.exit(0);
    }
    public static boolean noToPlay(){
        System.out.println("Are you feeling lucky? Would you like to play Guess my Secret Word?");
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
        boolean success = false;
        for (int i = 0; i < secretWord.length(); i++) {
            char letter = secretWord.charAt(i);
            String stringLetter = String.valueOf(letter);
            if (Objects.equals(guess, stringLetter)) {
                userWord = userWord.substring(0, i) + guess
                        + userWord.substring(i + 1);
                success = true;
            }
        } if(!success) {
            strikeCounter++;
            System.out.println("What a loser! That's a strike!");
        }
    }
    public static void displayKnownLetters(){
        System.out.println(userWord);
    }
    public static void checkWinTheGame(){
        if(userWord == secretWord) {
            System.out.println("You beat me this time. Even a broken clock is right twice a day");
            System.exit(0);
        }
    }
    public static void resolveLoss() {
        System.out.println("I bet you saw this coming. Three letters is too hard for you");
        System.exit(0);
    }


}




/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

