package com.Java.Game2.ConfirmBank_Generics;
//Обощенные классы.

public class CardInfoGenericClasses<T, V> {
    private T code;
    private V code2;

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }

    public V getCode2() {
        return code2;
    }

    public void setCode2(V code2) {
        this.code2 = code2;
    }

}