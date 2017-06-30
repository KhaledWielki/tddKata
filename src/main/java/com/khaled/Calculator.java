package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) {
        if(isEmpty(input)) {
            return 0;
        }
        return transformStringToInteger(input);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int transformStringToInteger(String input) {
        return Integer.parseInt(input);
    }
}
