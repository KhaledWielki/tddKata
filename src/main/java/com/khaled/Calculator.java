package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {

    public static final String deliminator = ",|\n";

    public int calculate(String input) throws Exception {

        String numbers[] = input.split(deliminator);

        if(isEmpty(input)) {
            return 0;
        }
        if(numbers.length == 1) {
            return transformInputToInt(input);
        }
        else  {
            return getSum(numbers);
        }
    }

    private int getSum(String[] numbers) throws Exception {
        int sum = 0;
        sum = countSum(numbers, sum);
        return sum;
    }

    private int countSum(String[] numbers, int sum) throws Exception {
        sum = calculateValues(numbers, sum);
        return sum;
    }

    private int calculateValues(String[] numbers, int sum) {
        for (String number : numbers) {
            if(transformInputToInt(number) > 1000) {
                continue;
            }
            sum += transformInputToInt(number);
        }
        return sum;
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int transformInputToInt(String input) {
        return Integer.parseInt(input);
    }
}
