package com.learn.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Builder<T> {
    private final Supplier<T> instantiator;
    private List<Consumer<T>> modifiers = new ArrayList<>();
    public Builder(Supplier<T> instantiator) {
        this.instantiator = instantiator;
    }
    public static <T> Builder<T> of(Supplier<T> instantiator) {
        return new Builder<>(instantiator);
    }
    public <P1> Builder<T> with(AddOneField<T, P1> consumer, P1 p1) {
        Consumer<T> c = instance -> consumer.accept(instance, p1);
        modifiers.add(c);
        return this;
    }

    public T build() {
        T value = instantiator.get();
        modifiers.forEach(modifier -> modifier.accept(value));
        modifiers.clear();
        return value;
    }
    /**
     * 1 参数 Consumer
     */
    @FunctionalInterface
    public interface AddOneField<T, P1> {
        void accept(T t, P1 p1);
    }

}
