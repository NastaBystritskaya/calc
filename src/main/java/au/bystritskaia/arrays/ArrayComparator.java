package au.bystritskaia.arrays;

public class ArrayComparator<T, V> {

    T[] firstArray;

    V[] secondArray;

    public ArrayComparator(T[] firstArray, V[] secondArray) {
        if(firstArray.length != secondArray.length)
            throw new RuntimeException("Количество элементов в масивах различно");
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }

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
