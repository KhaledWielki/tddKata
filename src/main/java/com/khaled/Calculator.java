package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) {

        final String deliminator = ",|\n";
        String numbers[] = input.split(deliminator);

        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return transformStringToInteger(input);
        }
        else {
            return getSum(numbers);
        }
    }

    private int getSum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            sum += transformStringToInteger(number);
        }

        return sum;
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int transformStringToInteger(String input) {
        return Integer.parseInt(input);
    }
}
