// Class for command line interface display functionality

public class DisplayCLI implements Display{

	public void displayBoard(String s) {
		System.out.println(s);
	}

  // public void displayAPI() {

  // }

  public void displayWinner(char colour) {
    System.out.println(colour + " is the winner!!!");
  }

  public void displayDraw() {
    System.out.println("This game is a draw!");
  }

  public void displayInvalid(){
    System.out.println("Invalid input, please retry:");
  }

  public void displayPlayInput(char colour) {
    System.out.print("\n" + colour + " player, it is your turn: ");
  }

}