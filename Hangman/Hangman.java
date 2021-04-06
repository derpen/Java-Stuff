import java.util.Scanner;

class Hangman{
	public static void main(String[] args){
		//What a fucking mess
		//This is just a personal project
		//Dont use this code please
		String word;
		Scanner input = new Scanner(System.in);
		System.out.println("Insert a word to be guessed here"); //2 player game basically
		word = input.nextLine();
		spacing(); //to hide the word
		String[] star = new String[word.length()];
		String[] before = new String[word.length()];
		for(int i = 0; i<word.length(); i++){
			star[i] = "*";
			before[i] = "*";
			System.out.print(star[i]);
		}
		System.out.println("");
		System.out.println("Guess it now u piece of shit, 1 letter at a time");
		Guess(word , 0, star, before);
	}
	
	public static void spacing(){
		for(int i = 0; i<50; i++){
			System.out.println("");
		}
	}

	public static String[] Stars(String word, String guess, String[] star){
		for(int i = 0; i<word.length(); i++){
			if(Character.toString(word.charAt(i)).equals(guess)){
				star[i] = guess;
			}
			System.out.print(star[i]);
		}
		System.out.println("");
		return star;
	}

	public static void Guess(String word, int count, String[] star, String[] before){
		if(count == 5){
			Graphic(count, word);
		}

		if(count < 5){
			Graphic(count, word);
			int letters = 0;
			Scanner lmao = new Scanner(System.in);
			String guess;
			guess = lmao.nextLine();
			for(int i = 0; i<guess.length(); i++){
				if(Character.toString(guess.charAt(i)) != ""){
					letters++; // make sure theres only 1 letter
					//Should have made this boolean instead of this garbage method
				}
			}
			if(letters > 1){
				System.out.println("Sry mate, 1 letter only please");
				Guess(word, count, star, before);
			}
			else{
				String[] result = Stars(word, guess, star);
				int check = 2;
				int temp = 2;
				int checkagain = 0; //make sure the 2nd check doesnt happen 
				// Implement another way for this garbage
				for(int l = 0; l<result.length; l++){
					if(Character.toString(word.charAt(l)).equals(guess)){ //check if Letter guessed is wrong
						check = 2;
						temp = 2;
						break;
					}
					else{
						check = 0;
						temp = 0;
						checkagain = 1;
					}
				}
				if(checkagain == 0){
					for(int j = 0; j<result.length; j++){ // check if letter guessed is correct
						if(result[j] != "*"){
							if(result[j] != before[j]){
								check = 2;
								temp = 2;
								break;
							}
						}
					}
				}
				
				for(int k = 0; k<result.length; k++){
					if(result[k] != "*"){
						check = 1;
					}
					else{
						check = temp;
						break;
					}
				}
				if(check == 1){
					System.out.println("You're winner"); //if win
				}
				else if(check == 2){
					Guess(word, count, star, before); //guessed a letter correct
				}
				else{
					Guess(word, ++count, star, before); //wrong guess
				}
			}
		}
	}

	public static void Graphic(int count, String word){
		//stolen from someone
		if(count == 0){
			System.out.println(" ----");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("___");
			System.out.println("");
		}
		if(count == 1){
			System.out.println(" ----");
			System.out.println(" |   O");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("___");
			System.out.println("");
		}
		if(count == 3){
			System.out.println(" ----");
			System.out.println(" |   O");
			System.out.println(" |   |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("___");
			System.out.println("");
		}
		if(count == 3){
			System.out.println(" ----");
			System.out.println(" |   O");
			System.out.println(" |  \\|/");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("___");
			System.out.println("");
		}
		if(count == 4){
			System.out.println(" ----");
			System.out.println(" |   O");
			System.out.println(" |  \\|/");
			System.out.println(" |  /");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("___");
			System.out.println("");
		}
		if(count == 5){
			System.out.println(" ----");
			System.out.println(" |   O");
			System.out.println(" |  \\|/");
			System.out.println(" |  / \\");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("___");
			System.out.println("");
			System.out.println("You lose you fucking nerd, the word is " + word);
		}
	}
}
