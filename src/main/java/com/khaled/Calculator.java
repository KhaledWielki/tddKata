package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {

    public static final String delimiter = ",|\n";

    public int calculate(String input) throws Exception {
        String numbers[] = input.split(delimiter);
        if(isEmpty(input)) {
            return 0;
        }
        if(input.length() == 1) {
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
        findDangerousInput(numbers);
        for (String number : numbers) {
            if(transformStringToInt(number) > 1000) {
                continue;
            }
            sum += transformStringToInt(number);
        }
        return sum;
    }

    private void findDangerousInput(String[] numbers) throws Exception {
        for (String number : numbers) {
            if(transformStringToInt(number) < 0){
                throw new Exception("Negative number!");
            }
        }
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private int transformStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
