package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner (System.in);
        
        Card[] hand = new Card[7];
        int max = 52;
        int min = 1;

        //Creates 7 random cards into an array
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) (Math.random() * ((max - min) + min) * 100));
            card.setSuit(RandomSuit assigned);
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        System.out.println("Enter a suit, then the number for the card: ");
        String suit = kb.next();
        int cardNum = kb.nextInt();
        
        for (int i=0; i<hand.length; i++){
            if (suit == hand[i].setSuit && cardNum == hand[i].setValue){
                System.out.println("card found");
                System.out.println();
                printInfo();
            }
            else {
                System.out.println("card not found");
            }
           
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Cody");
        System.out.println();
        
        System.out.println("My career ambitions: ");
        System.out.println("-- Get into some sort of software or game development role for the future");
        System.out.println("-- ");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Video games");
        System.out.println("-- Watching TV/Movies");
        System.out.println("-- Cars");

        System.out.println();
        
    
    }

}
