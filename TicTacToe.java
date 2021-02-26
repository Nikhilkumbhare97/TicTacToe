import java.util.*;

class TicTacToe {

	public static char[] board = new char[10];

	public char[] createboard(){

		for (  int i=0 ; i < 10; i++ ){
			board[i] = ' ';
		}
		return board;
	}

	public static char chooseLetter(Scanner userInput) {

		System.out.print("Choose your Letter X or O : ");
		return userInput.next().toUpperCase().charAt(0);
	}

   public static void main(String[] args){

		System.out.println("Welcome to TicTacToeGame");

		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseLetter(userInput);
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';

		System.out.println("User Letter: " +userLetter);
		System.out.println("Computer Letter: " +computerLetter);

      TicTacToe ticTacToeGame = new TicTacToe();
      ticTacToeGame.createboard();
	}
}
