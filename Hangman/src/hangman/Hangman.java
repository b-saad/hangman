package hangman;

import java.io.FileNotFoundException;
import javax.swing.JFrame;

/*
 *Name: Hangman
 *Description: Hangman is a word guessing game. A game that can either generate a word from a word bank or have the user input their own to use, after which the program will generate 
               blanks where the user has to input letters in order to guess the blank word. Winners guess the word before the hangman is complete; losers cannot guess the word before
               the hangman is complete. Scores are recorded (time included).
 *Due Date: Tuesday, January 24, 2017
 *Authors: Bilal Saad 
*/

public class Hangman {

    public static void main(String[] args) throws FileNotFoundException{

        // Creating a new JFrame object 
        JFrame frame = new HangmanView();
        
        // Seting the frame to visible to run the view
        frame.setVisible(true);
    }
    
}
