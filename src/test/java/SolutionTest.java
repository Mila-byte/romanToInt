import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void romanToIntTest() {
        Solution solution = new Solution();
        int result = solution.romanToInt("MCMXCIV");
        int expected = 1994;
        Assert.assertEquals(expected, result);
    }
}
