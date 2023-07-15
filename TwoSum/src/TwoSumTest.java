import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        int[] numsOne = {2, 7, 11, 15};
        int target1 = 9;
        int[] expectedOne = {0, 1};
        int[] resultOne = TwoSum.twoSum(numsOne, target1);
        Assert.assertArrayEquals(expectedOne, resultOne);

        int[] numsTwo = {3, 2, 4};
        int targetTwo = 6;
        int[] expectedTwo = {1, 2};
        int[] resultTwo = TwoSum.twoSum(numsTwo, targetTwo);
        Assert.assertArrayEquals(expectedTwo, resultTwo);

        int[] numsThree = {3, 3};
        int targetThree = 6;
        int[] expectedThree = {0, 1};
        int[] resultThree = TwoSum.twoSum(numsThree, targetThree);
        Assert.assertArrayEquals(expectedThree, resultThree);
    }
}
