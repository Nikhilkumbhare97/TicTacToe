class TicTacToe{

	public static  char[] board = new char[10];

	public char[] createboard(){
			for (  int i=0 ; i < 10; i++ ){
			board[i] = ' ';
			System.out.println( " Empty Space:" + board[i]);
		}
		return board;
	}

   public static void main(String[] args){

      TicTacToe ticTacToeGame = new TicTacToe();
      ticTacToeGame.createboard();
	}
}
