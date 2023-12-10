package org.example.secondtask;


import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    @Getter @Setter
    private Consumer<T> consumer;
    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
        onSignature();
    }

    public void onSignature() {
        setHeader(consumer.toString(), getId());
    }
}
