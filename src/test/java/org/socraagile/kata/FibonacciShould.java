package org.socraagile.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciShould {

    @DisplayName("The fibonacci number of 1 is 1")
    @ParameterizedTest(name = "{index} => F({0}) => {1}")
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5"
    })
    public void return_value_when_number(int number, int value) {
        Fibonacci fibonacci = new Fibonacci();

        int result = fibonacci.computeNth(number);

        assertThat(result).isEqualTo(value);
    }
}
