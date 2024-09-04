package co.edu.uptc.models;

import java.util.Comparator;
import java.util.List;

public class MySort<T> {

    public void sortData(List<T> list, Comparator<T> comparator) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (comparator.compare(list.get(i), list.get(j)) > 0) {
                    T aux = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, aux);
                }
            }
        }
    }
    

}
