package ua.mkaloshyn.lection2;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import ua.mkaloshyn.lection1.sorting.InsertionSort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InsertionSortTest {

    private static InsertionSort newSorting;

    @BeforeClass
    public static void initInsertionSorting() {
        newSorting = new InsertionSort();
    }

    @Ignore ("Just another possible option")
    @Test
    public void putElementsInAscendingOrder() {
        int[] expected = {-2, 0, 0, 5, 8, 11};
        int[] actual = newSorting.sort(new int[]{5, 0, -2, 0, 11, 8});
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void putElementsInAscendingOrder2() {
        int[] expected = {-2, 0, 0, 5, 8, 11};
        int[] actual = newSorting.sort(new int[]{5, 0, -2, 0, 11, 8});
        assertArrayEquals(expected, actual);
    }
}


