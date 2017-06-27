package com.khaled;

/**
 * Created by Adam on 2017-06-27.
 */
public class Calculator {
    public int calculate(String string) {
        if(string.isEmpty()){
            return 0;
        }
        return Integer.parseInt(string);
    }
}
