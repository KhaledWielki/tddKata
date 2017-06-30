package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String input) throws Exception {

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

    private int getSum(String[] numbers) throws Exception {
        int sum = 0;
        sum = countSum(numbers, sum);
        return sum;
    }

    private int countSum(String[] numbers, int sum) throws Exception {
        findDangerousInput(numbers);
        sum = calculateValue(numbers, sum);
        return sum;
    }

    private int calculateValue(String[] numbers, int sum) {
        for (String number : numbers) {
            if(transformStringToInteger(number) > 1000) {
                continue;
            }
            sum += transformStringToInteger(number);
        }
        return sum;
    }

    private void findDangerousInput(String[] numbers) throws Exception {
        for (String number : numbers) {
            if(transformStringToInteger(number) < 0) {
                throw new Exception("Negative number!");
            }
        }
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int transformStringToInteger(String input) {
        return Integer.parseInt(input);
    }
}
