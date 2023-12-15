package au.bystritskaia.pair;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Пара
 * @param <K> тип первого элемента пары
 * @param <V> Тип второго элемента пары
 */
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MyPairMap<K, V> {

    /**
     * Первый элемент
     */
    K first;

    /**
     * Второй элемент
     */
    V second;

    /**
     * Строчное представление объекта
     * @return Представление
     */
    @Override
    public String toString() {
        return """
                first: %s
                second: %s
                """.formatted(this.first, this.second);
    }
}
