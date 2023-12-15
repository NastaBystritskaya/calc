package au.bystritskaia.pair;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MyPairMap<K, V> {

    K first;
    V second;

    @Override
    public String toString() {
        return """
                first: %s
                second: %s
                """.formatted(this.first, this.second);
    }
}
