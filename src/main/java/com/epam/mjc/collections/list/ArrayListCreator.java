package com.epam.mjc.collections.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 3; i <= sourceList.size(); i+=3) {
            arrayList.add(sourceList.get(i - 1));arrayList.add(sourceList.get(i - 1));
        }
        return arrayList;
    }
}
