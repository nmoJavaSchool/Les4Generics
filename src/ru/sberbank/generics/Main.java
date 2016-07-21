package ru.sberbank.generics;
import javafx.util.Pair;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        //str.add(new Integer());

        Pair<Integer,String> p = new Pair<>(6,"sdf");

        A<List> a = new A<>();
        a.setField(new ArrayList<String>());
        A<String> astr = new A<>();
        astr.setField(new String("gerta"));
        System.out.println(a.getType());
        System.out.println(astr.getType());

        System.out.println(new A<String>(new String()){
            @Override
            public String getType() {
                return "Abstract" + super.getType();
            }
        }.getType());

        Integer in = new Integer(10);
        System.out.println(B.<String>getType());

        List<Integer> l = new ArrayList();
        l.add(new Integer(10));
        //l.add(new String("1234"));
    }
}
