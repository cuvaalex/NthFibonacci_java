package org.socraagile.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciShould {

    @DisplayName("The fibonacci number of 1 is 1")
    @Test
    public void return_1_when_1() {
        Fibonacci fibonacci = new Fibonacci();

        int result = fibonacci.computeNth(1);

        assertThat(result).isEqualTo(1);
    }
}
