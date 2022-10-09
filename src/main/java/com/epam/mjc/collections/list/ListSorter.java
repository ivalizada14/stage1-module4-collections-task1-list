package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer a_int = Integer.parseInt(a), b_int = Integer.parseInt(b);
        int a_int_result = 5*a_int^2+3;
        int b_int_result = 5*b_int^2+3;
        if(a_int_result==b_int_result)
            return a_int-b_int;
        return a_int_result-b_int_result;
    }
}
