package ru.sberbank.generics;

/**
 * Created by Student on 21.07.2016.
 */
public class A<T> {

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public T field;

    public A() {
    }

    public A(T param) {
        this.field = param;
    }

    public String getType(){
        return field.getClass().getTypeName();
    }
}
