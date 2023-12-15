package au.bystritskaia.list;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MyList <T> {

    T[] array;

    public MyList(T[] array) {
        this.array = array;
    }

    public void add(T element) {
        T[] result = (T[]) new Object[this.array.length + 1];
        result[result.length - 1] = element;
        for (int i = 0; i < this.array.length; i++) {
            result[i] = this.array[i];
        }
        this.array = result;
    }


    public void addFirst(T element) {
        T[] result = (T[]) new Object[this.array.length + 1];
        T temp = result[0];
        result[0] = element;
        result[result.length - 1] = temp;
        for (int i = 0; i < this.array.length; i++) {
            result[i + 1] = this.array[i];
        }
        this.array = result;
    }

    public void remove(T element) {
        int elementIndex = -1;
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i].equals(element)) {
                elementIndex = i;
                break;
            }
        }

        this.remove(elementIndex);

    }

    public void remove(int index) {
        if(index >= this.array.length)
            throw new RuntimeException("Индекс находится запределами коллекции. Удалении невозможно");
        T[] newArray = (T[]) new Object[this.array.length - 1];
        int j = 0;
        for (int i = 0; i < this.array.length; i++) {
            if(i != index) {
                newArray[j] = this.array[i];
                j++;
            }
        }
        this.array = newArray;
    }

    public Iterator<T> getIterator() {
        return new MyListIterator<>(this);
    }

    /**
     * Строчное представление объекта
     */
    @Override
    public String toString() {
        return """
                    Количество элементов: %d
                    Элементы: %s
                """.formatted(this.array.length, Arrays.toString(this.array));
    }
}
