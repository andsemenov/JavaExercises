package Generics.task2;

public class Calculator {

    public <N extends Number> double add(N val1, N val2){
        double sum;
        sum = val1.doubleValue() + val2.doubleValue();
        return sum;
    }

    public <N extends Number> double multiply(N val1, N val2){
        double multiply;
        multiply = val1.doubleValue() * val2.doubleValue();
        return multiply;
    }

    public <N extends Number> double divide(N val1, N val2){
        double divide;
        divide = val1.doubleValue() / val2.doubleValue();
        return divide;
    }

    public <N extends Number> double subtraction(N val1, N val2){
        double subtraction;
        subtraction = val1.doubleValue() - val2.doubleValue();
        return subtraction;
    }
}
