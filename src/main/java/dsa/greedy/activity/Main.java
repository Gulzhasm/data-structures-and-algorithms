package dsa.greedy.activity;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Activity> activities = new ArrayList<>();
        activities.add(new Activity("A1", 0, 6));
        activities.add(new Activity("A2", 3, 4));
        activities.add(new Activity("A3", 1, 2));
        activities.add(new Activity("A4", 5, 8));
        activities.add(new Activity("A5", 5, 7));
        activities.add(new Activity("A6", 8, 9));

        ActivitySelection.activitySelection(activities);
    }
}
