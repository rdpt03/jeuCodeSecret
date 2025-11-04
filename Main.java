package jeuCodeSecret;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code = generateCode();
		Scanner sc = new Scanner(System.in);
		boolean playing = true;
		
		//start the game
		while(playing) {
			//get user input
			String codeProposal = sc.nextLine();
			//check if correct input
			if(codeProposal.matches("[0-9]{4}")) {
				//check if the player guessed the code
				if(code.equals(codeProposal)) {
					System.out.println("Bravo! vous avez deviné le code!");
					return;
				}
			}
			
		}
				
		
	}
	
	public static String generateCode() {
		/**
		 * function to generate the random number
		 * @return a number between 0000 and 9999 
		 */
		int num = (int) (Math.random() * 10000);
		return String.format("%04d", num);
	}

}
