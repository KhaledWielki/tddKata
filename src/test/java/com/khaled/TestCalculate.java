package com.khaled;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by Adam on 2017-06-27.
 */
public class TestCalculate {

    private Calculator calculator;

    @Before
    public void initial() {
        calculator = new Calculator();
    }

    @Test
    public void emptyStringReturnsZero() throws Exception {
        Assert.assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void singleValueReplied() throws Exception {
        Assert.assertEquals(calculator.calculate("1"), 1);

    }

    @Test
    public void twoNumbersComaDelimitedReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1,2"), 3);
    }

    @Test
    public void twoNumbersNewLineDelimitedReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1\n2"), 3);

    }

    @Test
    public void threeNumbersDelimitedBothWaysReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1,2,3"), 6);
    }

    @Test(expected = Exception.class)
    public void negativeInputReturnsException() throws Exception {
        calculator.calculate("-1");
    }
}
