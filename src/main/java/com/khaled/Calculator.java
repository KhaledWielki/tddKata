package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) {
        String numbers[] = input.split(",");
        if(isEmpty(input)) {
            return 0;
        }
        if(input.length() == 1) {
            return transformStringToInt(input);
        }
        else {
            return transformStringToInt(numbers[0]) + transformStringToInt(numbers[1]);
        }
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int transformStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
