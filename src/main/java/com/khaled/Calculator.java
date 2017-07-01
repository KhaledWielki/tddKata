package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) {
        if(input.isEmpty()) {
            return 0;
        }
        else {
            return Integer.parseInt(input);
        }
    }
}
