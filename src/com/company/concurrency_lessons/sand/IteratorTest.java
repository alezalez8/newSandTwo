package com.company.concurrency_lessons.sand;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorTest {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{34, 445, 22, 12, 56, 67, 87, 21};
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list = getRandomList();
        for (int i : Range.fromTo(0, 100)) {
            System.out.println(i);
        }

       // showList(list);
       // System.out.println();
       // list.removeIf(item -> item >= 128);
      //  showList(list);




    }

    private static class Range implements Iterable<Integer> {
        int start;
        int end;

        public static Range fromTo(int from, int to) {
            return new Range(from, to);
        }

        private Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator1(start);
        }

        class Iterator1 implements Iterator<Integer> {
            int current;

            public Iterator1(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }


    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add((int) Math.round(Math.random() * 256));
        }
        return list;
    }

    public static void showList(LinkedList<Integer> list) {
        for (Integer item : list
        ) {
            System.out.print(item + "  ");
        }


    }
}
