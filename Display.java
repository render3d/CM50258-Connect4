// Interface for game outputs including the Connect4 grid and the API
 
public interface Display {
	
	void displayBoard(String s); 

  // void displayAPI();

  void displayWinner(char colour);

  void displayDraw();

  void displayInvalid();

  void displayPlayInput(char colour);

}