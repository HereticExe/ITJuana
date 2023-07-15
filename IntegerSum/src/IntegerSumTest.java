import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IntegerSumTest {
    @Test
    public void testFindMissingNumbers() {
        int[] numsOne = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expectedOne = Arrays.asList(5, 6);
        List<Integer> resultOne = IntegerSum.numberList(numsOne);
        Assert.assertEquals(expectedOne, resultOne);

        int[] numsTwo = {1, 1};
        List<Integer> expectedTwo = Arrays.asList(2);
        List<Integer> resultTwo = IntegerSum.numberList(numsTwo);
        Assert.assertEquals(expectedTwo, resultTwo);

        // Add more test cases as needed
    }
}
