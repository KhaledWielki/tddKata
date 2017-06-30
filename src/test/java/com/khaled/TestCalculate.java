package com.khaled;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by Adam on 2017-06-27.
 */
public class TestCalculate {

    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void emptyStringReturnsZero() throws Exception {
        Assert.assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void singleValueIsReplied() throws Exception {
        Assert.assertEquals(calculator.calculate("1"), 1);
    }

    @Test
    public void twoNumbersCommaDelimitedReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1,2"), 3);
    }

    @Test
    public void twoNumbersDelimitedWithNewLineReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1\n2"), 3);
    }

    @Test
    public void threeNumbersDelimitedWithBothWaysReturnSum() throws Exception {
        Assert.assertEquals(calculator.calculate("1\n2,3"), 6);
    }

    @Test(expected = Exception.class)
    public void negativeNumberReturnsException() throws Exception {
        calculator.calculate("-1");
    }

    @Test
    public void shouldNotAddNumberGreaterThan1000() throws Exception {
        Assert.assertEquals(calculator.calculate("10,10,2000"), 20);
    }
}
