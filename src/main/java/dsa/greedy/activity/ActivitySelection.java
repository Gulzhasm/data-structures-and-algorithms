package dsa.greedy.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

    static void activitySelection(ArrayList<Activity> activityList) {

        Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getFinishTime() - o2.getFinishTime();
            }
        };
        Collections.sort(activityList, finishTimeComparator);
        Activity prevActivity = activityList.get(0);

        System.out.println("Recommended Schedule \n" + activityList.get(0));

        for (int i = 0; i < activityList.size(); i++) {
            Activity activity = activityList.get(i);
            if (activity.getStartTime() >= prevActivity.getFinishTime()) {
                System.out.println(activity);
                prevActivity = activity;
            }
        }

    }
}
