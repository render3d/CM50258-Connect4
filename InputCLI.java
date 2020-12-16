// Class for command line interface input functionality

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCLI implements Input{

  private BufferedReader in;

  public void userInput() {
    in = new BufferedReader(new InputStreamReader(System.in));
  }

	public int getColumn() {
		try {
      return Integer.parseInt(in.readLine());
		}
		catch(IOException e) {
			return -1;
		}
	}

}