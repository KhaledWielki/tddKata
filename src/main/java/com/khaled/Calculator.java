package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) {

        final String delimiter = ",|\n";
        String[] numbers = input.split(delimiter);

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
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        return sum;
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int parseStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
