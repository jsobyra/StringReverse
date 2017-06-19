import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kuba on 19.06.17.
 */
public class TestMain {

    @Test
    public void testOfStringReverse() {
        Helper tester = new Helper(); // MyClass is tested

        assertEquals("empty string", "", tester.reverseString(""));
        assertEquals("single letter", "a", tester.reverseString("a"));
        assertEquals("single word", "elpmaxe", tester.reverseString("example"));
        assertEquals("single word with spaces in front and end of it", " elpmaxe ",
                tester.reverseString(" example "));
        assertEquals("whole sentence", "gib nworb xof depmuj revo a yzal god",
                tester.reverseString("big brown fox jumped over a lazy dog"));
    }
}
