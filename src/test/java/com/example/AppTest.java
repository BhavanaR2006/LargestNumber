package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testLargestNumber() {
        App obj = new App();
        assertEquals(25, obj.findLargest(10, 25, 15));
    }

    @Test
    public void testLargestWhenFirstIsLargest() {
        App obj = new App();
        assertEquals(50, obj.findLargest(50, 20, 30));
    }

    @Test
    public void testLargestWhenThirdIsLargest() {
        App obj = new App();
        assertEquals(100, obj.findLargest(10, 20, 100));
    }
}