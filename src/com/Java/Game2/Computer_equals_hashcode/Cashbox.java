package com.Java.Game2.Computer_equals_hashcode;

import java.util.Objects;

public class Cashbox {
    String model;

    public Cashbox(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cashbox cashbox = (Cashbox) o;
        return Objects.equals(model, cashbox.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}