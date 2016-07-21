package ru.sberbank.generics;

/**
 * Created by Student on 21.07.2016.
 */
public class B extends A{
    public static <T> String getType(T obj){
        return obj.getClass().getTypeName();
    }

}
