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
            return transformStringToInt(input);
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
        sum = calculateSum(numbers, sum);
        return sum;
    }

    private int calculateSum(String[] numbers, int sum) {
        for (String number : numbers) {
            if(transformStringToInt(number) > 1000) {
                continue;
            }
            sum += transformStringToInt(number);
        }
        return sum;
    }

    private int transformStringToInt(String input) {
        return Integer.parseInt(input);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
}
