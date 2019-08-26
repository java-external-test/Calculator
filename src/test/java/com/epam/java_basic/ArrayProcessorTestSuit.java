package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Non-hidden tests, shouldn't be used by Autocode
 */
@RunWith(JUnit4.class)
public class ArrayProcessorTestSuit {

    public ArrayProcessorTestSuit() {}

    @Test
    public void testSwapMaxNegativeAndMinPositiveElements() {
        int[] input = new int[] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int[] expectedResult = new int[] {-4, 4, 8, 0, -5, -1, 8, 5, 2, 7, 5, 5, 6, 0, 7, 1, -7, -6, -2, 9};
        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] result = arrayProcessor.swapMaxNegativeAndMinPositiveElements(input);
        assertThat(result, is(expectedResult));
    }

}
