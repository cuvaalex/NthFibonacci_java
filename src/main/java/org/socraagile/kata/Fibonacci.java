package org.socraagile.kata;

public class Fibonacci {
    public int computeNth(int number) {
        return fibonacci(number);
    }

    private int fibonacci(int number){
        if(number == 0)
            return 0;
        if(number == 1)
            return 1;
        return fibonacci(number-2) + fibonacci(number-1);
    }
}
