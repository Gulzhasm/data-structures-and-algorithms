package dsa.greedy.knapsack.fractional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapsack {
    static void knapsack(ArrayList<KnapsackItem> items, int capacity) {
        Comparator<KnapsackItem> comparator = (o1, o2) -> {
            if (o2.getRatio() > o1.getRatio()) return 1;
            else return -1;
        };
        Collections.sort(items, comparator);
        int usedCapacity = 0;
        double totalValue = 0;

        for (KnapsackItem item : items) {
            if (usedCapacity + item.getWeight() <= capacity) {
                usedCapacity += item.getWeight();
                System.out.println("Taken: " + item);
                totalValue += item.getValue();
            } else {
                int usedWeight = capacity - usedCapacity;
                double value = item.getRatio() * usedWeight;
                System.out.println("Taken item: " + item.getIndex() + " value: " + value);
                usedCapacity += usedWeight;
                totalValue += value;
            }
            if (usedCapacity == capacity) break;
        }
        System.out.println("total value: " + totalValue);
    }
}
