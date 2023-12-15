package au.bystritskaia.arrays;

/**
 * Сравнение массивов
 * @param <T> Тип первого массива
 * @param <V> Тип второго массива
 */
public class ArrayComparator<T, V> {

    /**
     * Первый массив
     */
    T[] firstArray;

    /**
     * Второй массив
     */
    V[] secondArray;

    /**
     * Конструктор
     * @param firstArray Первый массив
     * @param secondArray Второй массив
     */
    public ArrayComparator(T[] firstArray, V[] secondArray) {
        if(firstArray.length != secondArray.length)
            throw new RuntimeException("Количество элементов в масивах различно");
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }

    /**
     * Сравнение массивов
     * @return Результат сравненя
     */
    public boolean compare() {
        if(!this.firstArray.getClass().getComponentType().equals(this.secondArray.getClass().getComponentType()))
            return false;

        boolean result = true;
        for (int i = 0; i < this.firstArray.length; i++) {
            if(!this.firstArray[i].equals(this.secondArray[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
