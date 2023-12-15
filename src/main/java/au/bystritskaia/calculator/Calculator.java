package au.bystritskaia.calculator;

/**
 * Калькулятор чисел
 */
public class Calculator {

    /**
     * Сумма
     * @param t1 Первое число
     * @param t2 Второе число
     * @return Сумма
     * @param <T> Тип певого чисел
     * @[param <V> Тип второго числа
     */
    public <T extends Number, V extends Number> Double sum(T t1, V t2) {
        return t1.doubleValue() + t2.doubleValue();
    }

    /**
     * Вычитание
     * @param t1 Первое число
     * @param t2 Второе число
     * @return Разница
     * @param <T> Тип певого чисел
     * @[param <V> Тип второго числа
     */
    public <T extends Number, V extends Number> Double multiply(T t1, V t2) {
        return t1.doubleValue() - t2.doubleValue();
    }

    /**
     * Умножение
     * @param t1 Первое число
     * @param t2 Второе число
     * @return Значение произведения
     * @param <T> Тип певого чисел
     * @[param <V> Тип второго числа
     */
    public <T extends Number, V extends Number> Double divide(T t1, V t2) {
        return t1.doubleValue() * t2.doubleValue();
    }

    /**
     * Деление
     * @param t1 Первое число
     * @param t2 Второе число
     * @return Частное
     * @param <T> Тип певого чисел
     * @[param <V> Тип второго числа
     */
    public <T extends Number, V extends Number> Double subtract(T t1, T t2) {
        return t1.doubleValue() / t2.doubleValue();
    }


}
