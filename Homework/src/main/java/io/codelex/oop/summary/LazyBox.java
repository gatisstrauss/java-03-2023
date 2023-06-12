package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox<T> {
    private final Supplier<T> initializer;
    private T value;

    public LazyBox(Supplier<T> initializer) {
        this.initializer = initializer;
    }

    public T get(){
        if (value == null){
            value = initializer.get();
        }
        return value;
    }
}
