package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) {

        if(isEmpty(input)) {
            return 0;
        }
        return transformStringToInt(input);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int transformStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
