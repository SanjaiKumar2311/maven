package seleniumtest;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;

@Test
public class test {

    @Test
	public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
    }
}
