package ohero_redux.userInput;

import java.util.Scanner;

public class InputConsole {

    private Scanner playerInput;

    public InputConsole() {
        this.playerInput = new Scanner(System.in);
    }

    public String input() {
        return playerInput.nextLine();
    }
}
