package practices.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(56);
        arrayList.add(45);
        System.out.println(arrayList);

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
          arrayList.add(i);
        }
       //System.out.println(arrayList);


        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        //initialisation
        for (int i = 0; i < 3; i++) {
            multiList.add(new ArrayList<>());
        }

        //add
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiList.get(i).add(in.nextInt());
            }
        }
        System.out.println(multiList);

    }

}
