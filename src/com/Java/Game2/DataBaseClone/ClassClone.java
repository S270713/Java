package com.Java.Game2.DataBaseClone;

public class ClassClone implements Cloneable {
    int index;

    @Override
    protected ClassClone clone() throws CloneNotSupportedException {
        return (ClassClone) super.clone();
    }
}