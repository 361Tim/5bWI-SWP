package at.tim.algorithms.test;

import org.junit.jupiter.api.Test;

import at.tim.algorithms.DataGenerator;

import org.junit.Assert;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] data = DataGenerator.generateDataArray(10);
        Assert.assertEquals(data.length, 10);
    }

    @Test
    void testGenerateDataArray2() {
        int[] data = DataGenerator.generateDataArray(10, 99, 100);
        for (int i = 0; i < data.length; i++) {
            Assert.assertTrue(data[i] >= 99 && data[i] <= 100);
        }
    }
}
