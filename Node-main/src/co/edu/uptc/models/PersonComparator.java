package co.edu.uptc.models;

import java.util.Comparator;

public class PersonComparator {

    public static Comparator<Person> compName = new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }

    };

    public static Comparator<Person> compLastName = new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }

    };

    public static Comparator<Person> compAge = new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

    };

}
