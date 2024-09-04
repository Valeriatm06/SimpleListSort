package co.edu.uptc.test;

import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.MySort;
import co.edu.uptc.models.Person;
import co.edu.uptc.models.PersonComparator;
import co.edu.uptc.models.SimpleList;

public class Test {
    private List<Person> list;

    public void testArrayList() {
        loadDataArrayList();
        
    }

    public void testSimpleList() {
        loadDataSimpleList();
    }

    private void loadDataArrayList() {
        list = new ArrayList<Person>();

        list.add(new Person("Juan", "Aponte", 12));
        list.add(new Person("David", "Aguilar", 56));
        list.add(new Person("Julieta", "Venegas", 54));
        list.add(new Person("Selene", "Daza", 76));
        list.add(new Person("Helen", "Cardenas", 34));

    }

    private void loadDataSimpleList() {
        list = new SimpleList<Person>();

        list.add(new Person("Juan", "Aponte", 12));
        list.add(new Person("David", "Aguilar", 56));
        list.add(new Person("Melissa", "Pinto", 54));
        list.add(new Person("Selene", "Daza", 76));
        list.add(new Person("Helen", "Cardenas", 34));
    }

    public void sortData(){
        MySort<Person> mySort = new MySort<Person>();
        mySort.sortData(list, PersonComparator.compAge);
    }

    public void showData() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getLastName() + " " + list.get(i).getAge());
        }
    }


}
