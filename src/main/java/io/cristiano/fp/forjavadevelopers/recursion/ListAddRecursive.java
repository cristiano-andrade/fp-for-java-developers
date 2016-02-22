package io.cristiano.fp.forjavadevelopers.recursion;

import java.util.List;
import java.util.Objects;

public class ListAddRecursive {


    public static Integer call(List<Integer> values) {
        Objects.requireNonNull(values);
        if (values.size() == 1) {
            return values.get(0);
        } else {
            return values.get(0) + call(values.subList(1, values.size()));
        }
    }

}
