package ticTacToe;

public class Main {
	public static boolean playerTurn = true;
	public static boolean playerWon = false;
	public static boolean computerWon = false;
	public static tictactoe board = new tictactoe();
	
	
	public static void main(String[] args) {
		if(board.isVisible() == false){
			board.setVisible(true);
		}
	}
	
	public static void checkforwin(){
		if(board.button1.getText().equals("X")){
			if(board.button4.getText().equals("X")){
				if(board.button7.getText().equals("X")){
					playerWon = true;
							computerWon =false;
							System.out.printIn("Player Won!");
					
				}

			}
		}
			if(board.button1.getText().equals("X")){
				if(board.button5.getText().equals("X")){
					if(board.button9.getText().equals("X")){
						playerWon = true;
								computerWon =false;
								System.out.printIn("Player Won!");

		
	}

}
