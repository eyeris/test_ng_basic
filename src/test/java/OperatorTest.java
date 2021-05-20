import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test(groups = { "checkin-test" })
public class OperatorTest {

    @Test(groups = { "addition_group" })
    public void testAddNumbers() {
        Assert.assertEquals(Operator.addNumbers("10","5"),15);
    }

    @Test
    public void testSubtractNumbers() {
        Assert.assertEquals(Operator.subtractNumbers("10","5"),5);
    }

    @Test
    public void testMultiplyNumbers() {
    }

    @Test
    public void testDivideNumbers() {
    }

    @Test(groups = { "addition_group" })
    public void testAddNumbersPlus() throws InterruptedException {
        Assert.assertEquals(Operator.addNumbersPlus("10","5"),15);
    }
}