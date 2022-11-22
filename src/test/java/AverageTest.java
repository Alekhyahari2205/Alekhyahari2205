import Average.Average;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AverageTest {
    private final Average avg = new Average();
    private final int[] list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private final int[] list2 = new int[]{};
    private final int k1 = 3;
    private final int k2 = 0;
    private final int k3 = -1;
    private final int k4 = list1.length +5;
    @Test
    public void  average() {
        Average result = new Average();
        int res1 = result.average(k1, list1);
        assertEquals(2,res1);
        int res2 = result.average(k2,list1);
        assertEquals(0,res2);
        int res3 = result.average(k3,list1);
        assertEquals(0,res3);
        int res4 = result.average(k4,list1);
        assertEquals(5,res4);
        int res5 = result.average(k1,list2);
        assertEquals(0,res5);
        int res6 = result.average(k2,list2);
        assertEquals(0,res6);
    }
}