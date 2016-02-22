package io.cristiano.fp.forjavadevelopers.functions;

public class Calculator<A1 extends Number, A2 extends Number> {


    private Number leftNumber;
    private Number rightNumber;


    public Calculator(Number leftNumber, Number rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public <T> T calc(Function2<Number, Number, T> op) {
        return op.apply(leftNumber, rightNumber);
    }

}
