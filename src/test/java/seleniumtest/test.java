
package seleniumtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

    @Test
    public void sampleTest() {
        int actual = 2 + 3;
        int expected = 5;
        Assert.assertEquals(actual, expected, "Sum is incorrect");
    }
}
