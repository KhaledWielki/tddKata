package com.khaled;

import org.junit.Test;
import org.junit.Assert;
/**
 * Created by Adam on 2017-06-27.
 */
public class TestCalculate {

    @Test
    public void emptyStringReturnsZero() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.calculate(""), 0);
    }
}
