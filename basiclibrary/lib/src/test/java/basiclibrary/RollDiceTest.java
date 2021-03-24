package basiclibrary;
import org.junit.Test;
import static org.junit.Assert.*;
public class RollDiceTest {
    @Test public void testRollDice(){
        int[] arr = {6,6,6,6,6,6};
        int expectedOutput = arr.length;
        int actualOutput = RollDice.roll(6).length;
        assertEquals("Should return same number of elements",
                expectedOutput,
                actualOutput);
    }

    @Test public void testHasDuplicates(){
        int[] arr = {2,4,5,6,6,6};
        boolean actualOutput = RollDice.containsDuplicates(arr);
        assertTrue("Length of variables must be the same ",actualOutput);
    }

    @Test public void testFindAverage(){
        int[] arr = {57, 65, 65, 70, 72, 65, 51};
        String expectedOutPut = "63.57";
        String actualOutput = String.format("%.2f",RollDice.findAverage(arr));
        assertEquals("it should choose the smallest average",expectedOutPut,actualOutput);
    }

    @Test public void testFindSmallestAverage(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60}, // 63.0
                {57, 65, 65, 70, 72, 65, 51},  //63.5714
                {55, 54, 60, 53, 59, 57, 61},// 57.0
                {65, 56, 55, 52, 55, 62, 57} // 57.4286
        };
        double expectedOutput = 57.0;
        double actualOutput = RollDice.findSmallestAverage(weeklyMonthTemperatures);
        assertEquals(expectedOutput,actualOutput,0);
    }
}
