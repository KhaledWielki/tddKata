package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String string) {
        if(isEmpty(string)) {
            return 0;
        }
        return transformStringToInt(string);
    }

    private boolean isEmpty(String string) {
        return string.isEmpty();
    }

    private int transformStringToInt(String string) {
        return Integer.parseInt(string);
    }
}
