package ua.mkaloshyn.lection2;

import org.junit.BeforeClass;
import org.junit.Test;
import ua.mkaloshyn.lection1.sorting.BubbleSort;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortingTest {

    private static BubbleSort newSorting;

    @BeforeClass
    public static void initBubbleSorting(){
        newSorting = new BubbleSort();
    }

    @Test
    public void putElentsInAscendingOrder() {
        int[] expected = {-2, 0, 0, 5, 8, 11};
        int[] actual = newSorting.sort(new int[]{5, 0, -2, 0, 11, 8});
        assertArrayEquals(expected, actual);
    }
}
