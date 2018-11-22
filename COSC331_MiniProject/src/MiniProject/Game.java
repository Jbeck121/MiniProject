package MiniProject;

import java.util.Scanner;


public class Game {

	public static void gameboard( ) {
		
		//Sets up the map of the board
		int[] board = new int[10];
		board[0] = 10;
		board[1] = 0;
		board[2] = 0;
		board[3] = 11;
		board[4] = 0;
		board[5] = 11;
		board[6] = 11;
		board[7] = 0;
		board[8] = 0;
		board[9] = 0;
		//Game intro
		System.out.println("Welcome to the game. You are on plot 0 of a 10 plot dungeon.");
		System.out.println("Would you like to advance? \n Y or N");
		Scanner userInput1 = new Scanner(System.in);
		//Move forward
		String yn1 = userInput1.next();
		if(yn1 != null && yn1 ==  "Y") {
			System.out.println("Your hero advances to the next plot.");
			
		}
		//kills lazy players
		if(yn1 != null && yn1 == "N") {
			System.out.println("Your hero remains where he is. He dies of starvation.");
			System.out.println("GAME OVER");
			System.exit(0);
		}
		//Sets old space so it ignores it hopefully, moves hero up a spot
		board[0] = 1;
		if(board[1] == 0) 
			board[1] = 10;
	//Hero moves up, intro to plot and advancement prompt
		if(board[1] == 10) {
			System.out.println("The hero is on plot 1.");
			System.out.println("Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			//move on prompt
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			//kills
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				//exit game
				System.exit(0);
				
			}
			//if enemy, gives options
		}else if(board[1] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			
			//Differentiates run vs attack and prints appropriate string
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and advances to the next plot!");
								
			}
		}else if(board[1] == 1) {
			return;
		}else {
				System.out.println("There is nothing here. Would you like to advance? \n Y or N");
				Scanner userInput = new Scanner(System.in);
				String yn = userInput.next();
				while(yn != null && yn ==  "Y") {
					System.out.println("Your hero advances to the next plot.");
					
				}
				while(yn != null && yn == "N") {
					System.out.println("Your hero remains where he is. He dies of starvation.");
					System.out.println("GAME OVER");
					System.exit(0);
					
				}
			}
		board[1] = 1;
		if(board[2] == 0) 
			board[2] = 10;	
		
		if(board[2] == 10) {
			System.out.println("The hero is on plot 2.");
			System.out.println("Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}else if(board[2] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and advances to the next plot!");
				
				
			}
		}else if(board[2] == 1) {
			return;
		}else {
				System.out.println("There is nothing here. Would you like to advance? \n Y or N");
				Scanner userInput = new Scanner(System.in);
				String yn = userInput.next();
				while(yn != null && yn ==  "Y") {
					System.out.println("Your hero advances to the next plot.");
					
				}
				while(yn != null && yn == "N") {
					System.out.println("Your hero remains where he is. He dies of starvation.");
					System.out.println("GAME OVER");
					System.exit(0);
					
				}
			}
		
		board[2] = 1;
		if(board[3] == 0) 
			board[3] = 10;

				
		
		if(board[3] == 10) {
			System.out.println("The hero is on plot 1.");
			System.out.println("Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}else if(board[3] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and advances to the next plot!");
				
				
			}
		}else if(board[3] == 1) {
			return;
			
		}else {
				System.out.println("There is nothing here. Would you like to advance? \n Y or N");
				Scanner userInput = new Scanner(System.in);
				String yn = userInput.next();
				while(yn != null && yn ==  "Y") {
					System.out.println("Your hero advances to the next plot.");
					
				}
				while(yn != null && yn == "N") {
					System.out.println("Your hero remains where he is. He dies of starvation.");
					System.out.println("GAME OVER");
					System.exit(0);
					
				}
			}
				
				
		board[3] = 1;
		if(board[4] == 0) 
			board[4] = 10;	
		
		
		if(board[4] == 10) {
			System.out.println("The hero is on plot 4.");
			System.out.println("Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}else if(board[4] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and advances to the next plot!");
				
				
			}
		}else if(board[4] == 1) {
			return;
		}else {
			System.out.println("There is nothing here. Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}
		board[4] = 1;
		if(board[5] == 0) 
			board[5] = 10;	
				
		
		if(board[5] == 10) {
			System.out.println("The hero is on plot 5.");
			System.out.println("Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}else if(board[5] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and advances to the next plot!");
				
				
			}
		}else if(board[5] == 1) {
			return;
		}else {
			System.out.println("There is nothing here. Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}
		board[5] = 1;
		if(board[6] == 0) 
			board[6] = 10;	
				
		
		if(board[6] == 10) {
			System.out.println("The hero is on plot 6.");
			System.out.println("Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}else if(board[6] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and advances to the next plot!");
				
				
			}
		}else if(board[6] == 1) {
			return;
		}else {
			System.out.println("There is nothing here. Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}
		board[6] = 1;
		if(board[7] == 0) 
			board[7] = 10;	
				
		
		if(board[7] == 10) {
			System.out.println("The hero is on plot 7.");
			System.out.println("Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}else if(board[7] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and advances to the next plot!");
				
				
			}
		}else if(board[7] == 1) {
			return;
		}else {
			System.out.println("There is nothing here. Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}
			
		board[7] = 1;
		if(board[8] == 0) 
			board[8] = 10;	
		
		if(board[8] == 10) {
			System.out.println("The hero is on plot 8.");
			System.out.println("Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}else if(board[8] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and advances to the next plot!");
				
				
			}
		}else if(board[8] == 1) {
			return;
		}else {
			System.out.println("There is nothing here. Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the next plot.");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}
		board[8] = 1;
		if(board[9] == 0) 
			board[9] = 10;	
				
		
		if(board[9] == 10) {
			System.out.println("The hero is on plot 9.");
			System.out.println("This is the final plot. Would you like to advance?  \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances, and you win the game. Congratulations!");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}else if(board[9] == 11) {
			System.out.println("There is an enemy on this plot!");
			System.out.println("What would you like to do?");
			System.out.println("Choose from: 'run' or 'attack'");
			Scanner userInput = new Scanner(System.in);
			String i = userInput.next();
			while(i != null && i == "run") {
				System.out.println("Your hero runs past the enemy and barely survives.");
				System.out.println("Thankfully, the game is over anyway. YOU WIN!!!!!!");
				
			}
			while(i != null && i == "attack") {
				System.out.println("Your hero kills the enemy and wins the game!!!!");
				System.out.println("CONGRATULATIONS!!!!!!!");
				
				
			}
		}else if(board[9] == 1) {
			return;
		
		}else {
			System.out.println("There is nothing here. Would you like to advance? \n Y or N");
			Scanner userInput = new Scanner(System.in);
			String yn = userInput.next();
			while(yn != null && yn ==  "Y") {
				System.out.println("Your hero advances to the end of the game! Congratulations!!!!");
				
			}
			while(yn != null && yn == "N") {
				System.out.println("Your hero remains where he is. He dies of starvation.");
				System.out.println("GAME OVER");
				System.exit(0);
				
			}
		}
	}		
		
		
		
		

	
	/*public static int hero(int i) {
		i = 10;
		return i;
		
	}
	public static int enemy(int j) {
		j = 11;
		return j;
	}
*/
	
}
