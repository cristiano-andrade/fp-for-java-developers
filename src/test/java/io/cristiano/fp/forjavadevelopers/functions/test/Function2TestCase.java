package io.cristiano.fp.forjavadevelopers.functions.test;

import io.cristiano.fp.forjavadevelopers.functions.Calculator;
import io.cristiano.fp.forjavadevelopers.functions.Function2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Function2TestCase {


    @Test
    public void should_test_aritimetic_ops() {

        Function2 plus = new Function2<Double, Double, Double>() {
            @Override
            public Double apply(Double n1, Double n2) {
                return n1 + n2;
            }
        };

        Function2 divide = new Function2<Double, Double, Double>() {
            @Override
            public Double apply(Double n1, Double n2) {
                return n1 / n2;
            }
        };

        Function2 minus = new Function2<Double, Double, Double>() {
            @Override
            public Double apply(Double n1, Double n2) {
                return n1 - n2;
            }
        };


        Function2 mutiply = new Function2<Double, Double, Double>() {
            @Override
            public Double apply(Double n1, Double n2) {
                return n1 * n2;
            }
        };

        assertEquals(4.0d, new Calculator<Double, Double>(2.0d, 2.0d).calc(plus));
        assertEquals(2.0d, new Calculator<Double, Double>(4.0d, 2.0d).calc(divide));
        assertEquals(4.0d, new Calculator<Double, Double>(5.0d, 1.0d).calc(minus));
        assertEquals(10.0d, new Calculator<Double, Double>(5.0d, 2.0d).calc(mutiply));
    }


}
