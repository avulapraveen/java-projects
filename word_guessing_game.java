package wordguessing;
import java.util.Random; 
import java.util.Scanner;
public class word_guessing_game {
	private String wordtoguess;
	private char[] guessedLetters;
	private int attempts;
	public word_guessing_game(String[] wordList,int maxattempts){
		// TODO Auto-generated method stub
		Random rand=new Random();
		
		this.wordtoguess = wordList[rand.nextInt(wordList.length)];
		System.out.println(this.wordtoguess);
	    this.guessedLetters = new char[this.wordtoguess.length()];
	    
	    for(int i=0;i<this.guessedLetters.length;i++) {
	    	this.guessedLetters[i]='_';
	    }
	    this.attempts=maxattempts;

	}

	public String play() {
		int size=wordtoguess.length();
		System.out.println(size);
		//System.out.println("the word is :"+wordtoguess);
		Scanner scan=new Scanner(System.in);
		//boolean userhaswon=false;
		
		while(size >0/* && !userhaswon*/) {
			displaystate();

			System.out.println("you have "+size+"attempts left...");
			System.out.print("Guess a letter: ");
			 
			char guess=scan.nextLine().toLowerCase().charAt(0);
			//System.out.println(guess);
			
			if(process(guess)) {
				
				System.out.println("the guess is correct!");
				
				if(new String(guessedLetters).equals(wordtoguess)) {
					System.out.println("you have guessed the word! you win!");
					System.out.println("the word is : "+wordtoguess);
					return "win";
				//userhaswon=true;
					
				}	  

				
			}else {
				
				System.out.println("the guess was in-corret!");
		
	 }	  size--;

	}
		/*if(!userhaswon) {
			System.out.println("you are out of guess! :: you lost! ");
			System.out.println("the correct word is : "+wordtoguess);

		}*/
		return "loss";
	}
    
	private boolean process(char letter) {
		boolean letterfound=false;
		for(int i=0; i<wordtoguess.length();i++) {
			if(wordtoguess.charAt(i)==letter) {
			guessedLetters [i]=letter;
			letterfound=true;
		}
		}
		System.out.println(letter);

		//System.out.println(letterfound);
		return letterfound;
	}
	private void displaystate() {
	 System.out.println("guessed letters :"+ new String(guessedLetters));
}}
