package au.bystritskaia.calculator;

public class Calculator {


    public <T extends Number> Double sum(T t1, T t2) {
        return t1.doubleValue() + t2.doubleValue();
    }

    public <T extends Number> Double multiply(T t1, T t2) {
        return t1.doubleValue() - t2.doubleValue();
    }


    public <T extends Number> Double divide(T t1, T t2) {
        return t1.doubleValue() * t2.doubleValue();
    }

    public <T extends Number> Double subtract(T t1, T t2) {
        return t1.doubleValue() / t2.doubleValue();
    }


}
