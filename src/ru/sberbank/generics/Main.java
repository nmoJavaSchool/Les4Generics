package ru.sberbank.generics;
import javafx.util.Pair;

import java.util.*;
import java.util.concurrent.atomic.DoubleAccumulator;

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
        //System.out.println(B.<String>getType(in));

        List<Integer> l = new ArrayList();
        l.add(new Integer(10));
        //l.add(new String("1234"));

        A <? extends Integer> aa = new A<>(new Integer(10));//через конструктор можно задать свойство
        //aa.setField(new Integer(10));//напрямую нельзя
        Number i = aa.getField();
        System.out.println(aa.getType());

        A <? extends B> aaa = new A<>(new B());
        A a1 = aaa.getField();
        B b1 = aaa.getField();
        //C c1 = aaa.getField();

        List<? super Number> list = new ArrayList<>();
        list.add(new Integer(10));
        list.add(new Double(11));
        list.add(new Integer(12));
        list.add(new Double(13));

        list.forEach(System.out::println);

        Object i1 = list.get(0);
        //Integer ini = list.get(0);
    }
}
