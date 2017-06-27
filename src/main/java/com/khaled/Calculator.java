package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) {

        String[] numbers = input.split(",|\n");

        if(isEmpty(input)){
            return 0;
        }
        if(input.length() == 1) {
            return parseStringToInt(input);
        }
        else {
            return getSum(numbers);
        }
    }

    private int getSum(String[] numbers) {
        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int parseStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
