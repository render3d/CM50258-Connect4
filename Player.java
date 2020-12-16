// Counter == counter

public abstract class Player {
	
	private char counter;

	public Player(char counter) {
		this.counter = counter;
	}
	
	abstract int getMove();
	
	public char getCounter() {
		return counter;
	}
}