
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BlackjackGame1 {

	//USER INPUT VALUES
	private static final String String = null;
	static String hit = "H";
	static String stay = "S";
	
	//RANDOM INT METHOD
	public static int getRandomInteger(int maximum,int minimum) {
	       return ((int) (Math.random()*(maximum-minimum))) + minimum;
	    }
	
	public static int getRandom(int[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}
	
	//HIT METHOD NEW CARD3
		public static void Hit() {
			Random random = new Random();
	        int card3 = 0;
	        for(int counter=1; counter<=1; counter++) {
	            card3 = (getRandomInteger(2,10));
	        }
	        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
		    Random r = new Random();
		    int randomSuit = r.nextInt(suits.length);
		        
			System.out.println("New Card: " + card3 + " " + ((suits[randomSuit])));
			System.out.println();
			
	        
		}
		
		//MAIN CLASS
		public static void main (String [] args) {
			
			  //NAME JOPTIONPANE
			String name = JOptionPane.showInputDialog("Enter Name: ");
			System.out.println("Hello, " + name + "!");
			
			//DIRECTIONS
			System.out.println("Please read the directions to play below: ");
			System.out.println();
			System.out.println("---RULES TO PLAY BLACKJACK---");
			System.out.println();
			System.out.println("1. The goal of the game is to get to 21.");
			System.out.println("2. You recieve two cards from the dealer. Add up the total of those cards.");
			System.out.println("3. Next, choose to Hit (H) to receive another card or to stay (S) if you don't want to go higher.");
			System.out.println("4. If your total is equal to or closer to 21, you win! If not, the computer wins!");
			System.out.println();
			System.out.println("NOW IT'S TIME TO PLAY BLACKJACK!");
			
			
			//COMPUTER RANDOM CARD1
			Random crandom1 = new Random();
			int ccard1 = 0;
			for(int count=1; count<=1; count++) {
		    ccard1 = (getRandomInteger(2,11));
			}
			
			//COMPUTER RANDOM CARD2
			Random crandom2 = new Random();
			int ccard2 = 0;
			for(int count=1; count<=1; count++) {
		    ccard2 = (getRandomInteger(12, 14));
			}
			
			int compvalue = ccard1 + ccard2;
			
			//USER RANDOM CARD1
			
			Random userrandom1 = new Random();
	        int card1 = 0;
	        for(int counter=1; counter<=1; counter++) {
	       card1 = (getRandomInteger(2,10));
			
			String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
		    Random r = new Random();
		    int randomSuit = r.nextInt(suits.length);
		        
			System.out.println("Card 1: " + card1 + " " + ((suits[randomSuit])));
	        }
	        
	        //USER RANDOM CARD2
	       
	        Random userrandom2 = new Random();
			int card2 = 0;
			for(int count=1; count<=1; count++) {
		    card2 = (getRandomInteger(9,11));
		    
		    if (card2 == 10) {
		    	String[] faces = {"King 10", "Queen 10", "Jack 10"};
			    Random f = new Random();
			    int randomFace = f.nextInt(faces.length);
				System.out.println("Card 2: " + ((faces[randomFace])));
		    }
		    
		    if (card2 == 11) {
		    	System.out.println("Card 2: Ace 11");
		    }
			}
			
			int usercards1 = card1 + card2;
			
			System.out.println("User's Total Cards Round 1: " + usercards1); 
			
			//HIT OR STAY QUESTION
			Scanner input1 = new Scanner(System.in);
			System.out.println("Do you want to Hit (H) or Stay (S)?");
			String options = input1.nextLine();
			
			//IF OPTION HIT
			if (options.contentEquals(hit)) {
				
				//USER RANDOM CARD3
				Random random = new Random();
		        int card3 = 0;
		        for(int counter=1; counter<=1; counter++) {
		            card3 = (getRandomInteger(2,10));
		        }
		        String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
			    Random r = new Random();
			    int randomSuit = r.nextInt(suits.length);
			        
				System.out.println("New Card: " + card3 + " " + ((suits[randomSuit])));
				System.out.println();
				
				int userfinal = card1 + card2 + card3;
		
				System.out.println("User's Total Card Value: " + userfinal);
				
				System.out.println("Computer Total: " + compvalue);
				
				//IF METHODS LOSE OR WIN
				if(userfinal == 21) {
					System.out.println("You win!");
				}
				
				if(compvalue == 21) {
					System.out.println("You lose! Computer wins!");
				}
				
				if(compvalue == userfinal) {
					System.out.println("It's a tie! Both values are equal!");
				}
				
				if (Math.abs(21 - userfinal) < Math.abs(21 - compvalue)){
						System.out.println("You win! Your total is closer to 21!");
					
				}
				
				if (Math.abs(21 - userfinal) > Math.abs(21 - compvalue)){
					System.out.println("You lose! Computer total was closer to 21!");
				
			}
				int [] rounds = {userfinal, compvalue, 21};
				Arrays.sort(rounds);
				System.out.printf("Order of Results: %s", Arrays.toString(rounds));
				
			}
			
			
			
			//IF OPTION STAY
			if (options.contentEquals(stay)) {
				
				System.out.println("User's Total Card Value: " + usercards1);
				
				System.out.println("Computer Total: " + compvalue);
				
				//IF METHODS LOSE OR WIN
				if(usercards1 == 21) {
					System.out.println("You win!");
				}
				
				if(compvalue == 21) {
					System.out.println("You lose! Computer wins!");
				}
				
				if(compvalue == usercards1) {
					System.out.println("It's a tie! Both values are equal!");
				}
				
				if (Math.abs(21 - usercards1) < Math.abs(21 - compvalue)){
						System.out.println("You win! Your total is closer to 21!");
					
				}
				
				if (Math.abs(21 - usercards1) > Math.abs(21 - compvalue)){
					System.out.println("You lose! Computer total was closer to 21!");
				
			}
				int [] rounds2 = {usercards1, compvalue, 21};
				Arrays.sort(rounds2);
				System.out.printf("Order of Results: %s", Arrays.toString(rounds2));
			}
			
			
			
		}
	
}
