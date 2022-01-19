package com.company.blackjava.lambda;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("fff");
        list.add("hhh");
        System.out.println(list);

        list.removeIf(s -> s.equals("ddd"));
        System.out.println(list);

    }
}
