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
    public void emptyStringReturnsZero() {
        Assert.assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void singleValueIsReplied() {
        Assert.assertEquals(calculator.calculate("1"), 1);
    }

    @Test
    public void twoNumbersCommaDelimitedReturnSum() {
        Assert.assertEquals(calculator.calculate("1,2"), 3);
    }

    @Test
    public void twoNumbersDelimitedWithNewLineReturnSum() {
        Assert.assertEquals(calculator.calculate("1\n2"), 3);
    }
}
