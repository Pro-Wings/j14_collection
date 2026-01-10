package com.prowings.collection.map;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

public class EnumMapDemo {

    public static void main(String[] args) {

        EnumMap<Month, Integer> em = new EnumMap<>(Month.class);

        em.put(Month.JANUARY, 31);
        em.put(Month.MARCH, 31);
        em.put(Month.JANUARY, 33);
        em.put(Month.APRIL, 30);
        em.put(Month.MAY, 31);
        em.put(Month.FEBRUARY, 28);
        em.put(Month.JUNE, 30);

        System.out.println("EnumMap elements: " + em);

        Set<Month> months = em.keySet();

        Iterator<Month> itr = months.iterator();

        while (itr.hasNext()) {
            Month month = itr.next();
            System.out.println(month);
        }

    }

}
