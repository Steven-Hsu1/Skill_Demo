import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void testConcat() {
        skillDemo skillDemo = new skillDemo();
        assertEquals("one two", skillDemo.concat("one", "two"));
    }
}
