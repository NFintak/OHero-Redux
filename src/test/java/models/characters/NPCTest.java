package models.characters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ohero_redux.models.characters.Characters;
import ohero_redux.models.characters.NonPlayerChar;
import ohero_redux.models.utilities.CharStats;

public class NPCTest {

    @Test
    public void testNullConstructor() {
        NonPlayerChar test = new NonPlayerChar();
        assertNotNull(test);
    }

    @Test
    public void test1NPCConstructor() {
        NonPlayerChar test = new NonPlayerChar("test");
        assertNotNull(test);
    }

    @Test
    public void test2NPCConstructor() {
        NonPlayerChar test = new NonPlayerChar("test", "Shopkeeper");
        assertNotNull(test);
    }

    @Test
    public void testNameGetterSetter() {
        NonPlayerChar test = new NonPlayerChar();
        assertEquals("", test.getName());
        String expected = "Scott";
        test.setName(expected);
        assertEquals(expected, test.getName());
    }

    @Test
    public void testTypeGetterSetter() {
        NonPlayerChar test = new NonPlayerChar();
        assertEquals("", test.getNPCType());
        String expected = "Allies";
        test.setNPCType(expected);
        assertEquals(expected, test.getNPCType());
    }

    @Test
    public void testHealthStatus() {
        NonPlayerChar test = new NonPlayerChar();
        assertEquals("0/0", test.getHealthStatus());
        test.getStats().setTempHealth(20);
        assertEquals("20/20", test.getHealthStatus());
    }

}
