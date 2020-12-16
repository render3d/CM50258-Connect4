import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyConnectFour {
	
	public void playGame(){
		// board = new char[6][7];
    Board board = new Board(6,7);

    // display start state of board
    Display cli = new DisplayCLI();
		cli.displayBoard(board.toString());

    // player list
    ArrayList<Player> players = new ArrayList<>();
		
    players.add(new Human('r'));
		players.add(new Computer('y'));
		int currentPlayer = 0;

    boolean isValid = false; 
    boolean hasWon = false;
    boolean isDraw = false;
    int m = 0;

    for (int t=0; t <= board.getTurns()+1; t++) {
      
      if (t == board.getTurns()+1){
        cli.displayDraw();
        break;
      }

      // get move
      do {
        cli.displayPlayInput(players.get(currentPlayer).getCounter());
        m = players.get(currentPlayer).getMove();
        isValid = board.isInputValid(board.toArray(0,m)[1]);
        if (!isValid){
          cli.displayInvalid();
        }
      }
      while (!isValid);

      // place counter 
      board.placeCounter(players.get(currentPlayer).getCounter(), players.get((currentPlayer+1)%players.size()).getCounter(), m);

      // print board
      cli.displayBoard(board.toString());

      // check win condition
      hasWon = checkWin(players.get(currentPlayer).getCounter(), board);
      if (hasWon){
        cli.displayWinner(players.get(currentPlayer).getCounter());
        break;
      }
      else{
        // switch/swap player
        currentPlayer = (currentPlayer+1)%players.size();
      }

    }
    
	}

  public boolean checkWin(char colour, Board b) {
      
    boolean hasWon = false;
			
    // check horizontal
    int count = 0;
    for(int i=0; i<b.getRows(); i++){
      for(int j=0; j<b.getCols(); j++){
        
        if(b.getBoard()[i][j] == colour){
          count = count + 1;
          if(count >= 4){
            hasWon = true;
          }
        }
        else{
          count = 0;
        }
        
      }
      
    }

    // check vertical 
    count = 0;
    for(int i=0; i<b.getCols(); i++){
      for(int j=0; j<b.getRows(); j++){
        
        if(b.getBoard()[j][i] == colour){
          count = count + 1;
          if(count >= 4){
            hasWon = true;
          }
        }
        else{
          count = 0;
        }
        
      }
      
    }

    /*
      Code for diagonal win check functionality adapted and extended from StackOverflow user, Ian Mc:
        https://stackoverflow.com/questions/48506672/checking-for-a-line-of-four-connect-four-in-java
      
    */

    // check \ diagonal
    for (int row = 0; row <= b.getRows()-4; row++) {
      for (int col = 0; col <= b.getCols()-4; col++) {
        boolean isLine = true;
        for (int i = 0; i<4 && isLine; i++) {
          if (b.getBoard()[row+i][col+i] != colour){
            isLine = false;
          }    
        }
        if (isLine) {
          hasWon = true;
        }
        
      }

    }

    // check / diagonal
    for (int row = b.getRows()-1; row >= 3; row--) {
      for (int col = 0; col <= b.getCols()-4; col++) {
        boolean isLine = true;
        for (int i = 0; i<4 && isLine; i++) {
          if (b.getBoard()[row-i][col+i] != colour){
            isLine = false;
          }    
        }
        if (isLine) {
          hasWon = true;
        }
        
      }

    }
    
    return hasWon;

  }

}
