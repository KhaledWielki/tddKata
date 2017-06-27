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
    public void emptyStringReturnsZero() {
        Assert.assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void singleValueReplied() {
        Assert.assertEquals(calculator.calculate("1"), 1);

    }

    @Test
    public void twoNumbersComaDelimitedReturnSum() {
        Assert.assertEquals(calculator.calculate("1,2"), 3);
    }
}
