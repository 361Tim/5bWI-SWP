package at.tim.algorithms.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import at.tim.algorithms.BaseAlgorithms;

public class BaseAlgorithmsTest {
    @Test
    void testMax() {
        int[] data = { 1000, 2, 3, 4 };
        Assert.assertEquals(BaseAlgorithms.max(data), 1000);
    }

    @Test
    void testMin() {
        int[] data = { 1000, 2, 3, 4 };
        Assert.assertEquals(BaseAlgorithms.min(data), 2);
    }

    @Test
    void testRevert() {
        int[] data = { 1, 2, 3, 4 };
        int[] reversedData = { 4, 3, 2, 1 };
        Assert.assertArrayEquals(BaseAlgorithms.revert(data), reversedData);
    }
}
