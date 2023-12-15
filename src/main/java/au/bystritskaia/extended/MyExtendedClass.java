package au.bystritskaia.extended;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.DataInput;
import java.io.InputStream;

/**
 * Обощенный класс
 * @param <T> 1 Обопщение
 * @param <V> 2 Обопщение
 * @param <K> 3 Обопщение
 */
@RequiredArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MyExtendedClass <T extends Comparable, V extends InputStream & DataInput, K extends Number> {

    /**
     * Первый параметр
     */
    T t;

    /**
     * Второй параметр
     */
    V v;

    /**
     * Третий параметр
     */
    K k;

    /**
     * Вывод типов параметров
     * @return Строка с типами
     */
    public String printTypes() {
       return """
                T : %s
                V : %s
                K : %s      
               """.formatted(
                       this.t.getClass().getSimpleName(),
                       this.v.getClass().getSimpleName(),
                       this.k.getClass().getSimpleName()
               );
    }
}
