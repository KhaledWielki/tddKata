package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {

    public static final String deliminator = ",|\n";

    public int calculate(String input) {

        String numbers[] = input.split(deliminator);

        if(isEmpty(input)) {
            return 0;
        }
        if(numbers.length == 1) {
            return transformStringToInt(input);
        }
        else {
            return getSum(numbers);
        }
    }

    private int getSum(String[] numbers) {
        return transformStringToInt(numbers[0]) + transformStringToInt(numbers[1]);
    }

    private int transformStringToInt(String input) {
        return Integer.parseInt(input);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
}
