package practices.oop.collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(23);
        list2.add(24);
        list2.add(33);
        System.out.println(list2);

        Vector<Integer> vector = new Vector<>();
        vector.add(23);
        vector.add(24);
        vector.add(33);
        System.out.println(vector);

        //enum examples
        Week week;
        week = Week.Friday;
        week.hello();
        for(Week days: Week.values()){
            System.out.println(days);
        }
    }
}


