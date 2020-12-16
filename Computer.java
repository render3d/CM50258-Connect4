// Class for bot/computer input - is a sublclass of player

import java.util.Random;

public class Computer extends Player{
	
	private Random rand;

	public Computer(char counter) {
		super(counter);
	}
	
	public int getMove() {
    rand = new Random();
    return (int)(Math.random()*(7)+1); // generalise 7 to number of columns in grid
	}
}
