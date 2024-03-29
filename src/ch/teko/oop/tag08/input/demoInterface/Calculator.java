package ch.teko.oop.tag08.input.demoInterface;

public class Calculator implements IArithmeticOperations {

    @Override
    public int sum(int numberA, int numberB) {
        return numberA + numberB;
    }

    @Override
    public int difference(int numberA, int numberB) {
        return numberA - numberB;
    }

    @Override
    public int product(int numberA, int numberB) {
        return numberA * numberB;
    }

    @Override
    public int quotient(int numberA, int numberB) {
        return numberA / numberB;
    }
}
