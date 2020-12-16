// Class for human input - is a sublclass of player

public class Human extends Player{

	public Human(char counter) {
    super(counter);
	}

  Input manualIn = new InputCLI();

  public int getMove(){
    manualIn.userInput();
    return playHuman();
  }
	
	public int playHuman() {
    return manualIn.getColumn();
	}

}