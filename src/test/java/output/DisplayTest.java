package output;

import ohero_redux.output.Display;
import ohero_redux.models.characters.PlayerChar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplayTest {

    Display display = new Display();
    PlayerChar testPlayer = new PlayerChar("test");


    @Test
    public void testDisplayOutput() {
        String expected = "Our adventure begins here!";
        String actual = display.messagePrompt("Our adventure begins here!");
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintStats() {
        String expected = "";
        String actual = display.printStats(testPlayer);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintChangedStats() {
        String expected = "";
        String actual = display.printStats(testPlayer);
        assertEquals(expected, actual);
    }

}
