package dsa.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
        numbers.add(40);
        // Time Complexity -------------------> O(1)
        // Space Complexity -------------------> O(1)
        ArrayList<String> s = new ArrayList<>();
        s.add("A");
        s.add(1, "AA"); // Time Complexity -------------------> O(N)
        s.add("B");


        //Accessing the element of ArrayList
        numbers.get(2);//Time Complexity -------------------> O(1) Space Complexity -------------------> O(1)

        //Traversing
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));
        for (int i = 0; i < stringList.size(); i++) {// Time Complexity -------------------> O(N)
            System.out.print(stringList.get(i));
        }
        System.out.println();
        for (String letter : stringList) {// Time Complexity -------------------> O(N)
            System.out.print(letter);
        }
        System.out.println();
        Iterator<String> iterator = stringList.iterator();// Time Complexity -------------------> O(N)
        while (iterator.hasNext()) {
            String letter = iterator.next();
            System.out.print(letter);
        }
        System.out.println();

        //search
        ArrayList<String> sList = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));
        for (String letter : sList) {// Time Complexity -------------------> O(N)
            if (letter.equals("B")) {// Time Complexity -------------------> O(1)
                System.out.println("The letter is found");
                {// Time Complexity -------------------> O(1)
                    break;
                }
            }

            int index = sList.indexOf("B");
            System.out.println("The element is found at the index of " + index);
        }
        //remove
        sList.remove(2);// Time Complexity -------------------> O(N)
        System.out.println(sList);
    }
}
