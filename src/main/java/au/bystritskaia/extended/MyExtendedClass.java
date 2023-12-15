package au.bystritskaia.extended;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.DataInput;
import java.io.InputStream;
import java.util.Date;

@RequiredArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MyExtendedClass <T extends Comparable, V extends InputStream & DataInput, K extends Number> {

    T t;

    V v;

    K k;

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
