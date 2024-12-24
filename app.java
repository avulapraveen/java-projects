package wordguessing;

import java.util.Scanner;

public class app {
	public static void main(String[]args) {
		String[] words= {"java","program","class","computer","method"};
		word_guessing_game game =new word_guessing_game(words,10);
		
		Scanner scan=new Scanner(System.in);
		
		boolean shouldplayagain=false;
		int wins=0;
		int losses=0;
		do {
			String result=game.play();
			//game.play(game);
			
			if(result.equals("win")) {
				wins+=1;
			}else {
				losses+=1;
			}
			
			System.out.println("wins :"+ wins +",losses : "+losses);
			
			System.out.print("would u want to play again ?(y/n): ");
			
			char playAgain= scan.nextLine().toLowerCase().charAt(0);
			
			shouldplayagain=playAgain=='y';
			
		}while(shouldplayagain);
		game.play();
	}

}
