class Main {
  
  public static void main(String[] args) {
    
    /* CONNECT4/N COURSEWORK PROGRAM DOCUMENTAION
    
      Access public repl here:
        https://repl.it/@render3d/Coursework2-4#Main.java

      This progam is by no means perfect, there are still some logic and runtime errors scattered in there but, for the sake of time efficiency and meeting these, and other, deadlines, I have prioritised abstraction and Object Oriented practices over comprehensive debugging.

      As such, all classes, both abstract or concrete, should interact seamlessly to deliver a playable, but imperfect, game of Connect4 between a single human user and a computer.
    
      New features include, but are by no means limited to, the following:
        - Two new interfaces for Input and Output/Display.

        - A new abstract class for types of player: computer or human.

        - A ConnectN class which should be considered as placeholder/preemptive infrastructure for ConnectN functionality described verbally in Section 4 of this submission.

        - A board class to handle tasks including, but not limited to, input validation, counter placement and abstraction of the board as a character array.

        - A refined MyConnect4 class containing the game logic as two methods:

          > playGame: for overall game logic at each stage of a players' turn, including a Draw endgame state.

          > checkWin: for checking if there is a winning condition/chain of four counters some place on the board after a players' turn, now including in the diagonals which were not present before.

    */

    System.out.println("");
    System.out.println(" *** WELCOME TO CONNECT4 *** ");
		System.out.println("> There are 2 players, red and yellow.");
		System.out.println("> You are Player 1 with Red counters, the computer is Player 2 with Yellow counters.");
		System.out.println("> To play the game type in the number of the column you want to drop you counter in.");
		System.out.println("> A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally.");
		System.out.println("");

    MyConnectFour g = new MyConnectFour();
    g.playGame();

  }
}