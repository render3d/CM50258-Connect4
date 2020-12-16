public class Board {
  
  // instantiate grid
  private char[][] board;
  private int row;
  private int clm;
  private int turns;

  public Board(int row, int clm) {
    this.row = row;
    this.clm = clm;

    board = new char[row][clm];
    turns = row*clm;
  }

  // place counter
  public void placeCounter(char player, char opponent, int column) {
		// player: players.get(currentPlayer).getCounter()
    // opponent: players.get((currentPlayer+1)%players.size()).getCounter()
    // column: m

    boolean placed = false;

    int position = toArray(0,column)[1];

    for(int i=board.length-1; i>=0; i--){
      if(!placed){
        if(board[i][position] == opponent){
          // skip
        }
        else if(board[i][position] != player){
          board[i][position] = player;
          placed = true;
        }
      }
    }

 	}
  
  // board string
  public String toString() {
 
    String toReturn = "";

    toReturn += "\n";
		for(int i=0; i<board.length; i++) { // i is rows
      toReturn += ((board.length-i) + "|"); // print y axis index
			for(int j=0; j<board[i].length; j++) { // j is columns
				if(board[i][j] == '\0') { // if empty fill with "   |"
					toReturn += ("   |");
				}
				else {
          toReturn += (" " + board[i][j] + " |");
          // toReturn += ("|"+ x + " " + y + "|");
				}
			}
      toReturn += i;
      toReturn += "\n";
		}
		toReturn += ("   1   2   3   4   5   6   7"); // append final row to string
    // System.out.println(toReturn);
		return toReturn;

  }

  public int[] toArray(int row, int col) {
    int[] arrayCoordinates = new int[2];

    arrayCoordinates[0] = (getRows()-row);
    arrayCoordinates[1] = (col-1);

    return arrayCoordinates;
  }

  public boolean isInputValid(int column) { // machine/internal interpretation of array
    boolean checkValid = false;
    if ((column <= getCols()-1) && (column >= 0)){
      for (int r = getRows()-1; r >= 0; r--) { // rows
        if (board[r][column] == '\0') { // check cell empty
          checkValid = true;
        }
        
      }
      
    }
    else{
      checkValid = false;
    }

    return checkValid;
  }

  // Board Property Accessors 

  int getTurns(){ // Maximum number of turns possible for a board with x columns and y rows
    return turns;
  }

  int getCols(){ // number of columns on the board
    return clm;
  }

  int getRows(){ // number of  rows on the board
    return row;
  }

  char[][] getBoard(){ // get board
    return board;
  }

}