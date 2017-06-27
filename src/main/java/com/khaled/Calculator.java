package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) throws Exception {

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

    private int getSum(String[] numbers) throws Exception {
        findDangerousInput(numbers);
        int sum = 0;
        sum = calculateValues(numbers, sum);
        return sum;
    }

    private int calculateValues(String[] numbers, int sum) {
        for (String number : numbers) {
            if(parseStringToInt(number) > 1000) {
                continue;
            }
            sum += parseStringToInt(number);
        }
        return sum;
    }

    private void findDangerousInput(String[] numbers) throws Exception {
        for (String number : numbers) {
            if(parseStringToInt(number) < 0) {
                throw new Exception("Negative input!");
            }
        }
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int parseStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
