import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question23_1 {
     static class Activity {
        int start, finish, index;
        Activity(int start, int finish, int index) {
            this.start = start;
            this.finish = finish;
            this.index = index;
        }
    }

    public static int maxActivities(int[] start, int[] finish) {
        int n = start.length;
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++)
            activities[i] = new Activity(start[i], finish[i], i);

        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

        int count = 1;
        List<Integer> selected = new ArrayList<>();
        selected.add(activities[0].index);
        int lastFinish = activities[0].finish;
        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastFinish) {
                count++;
                selected.add(activities[i].index);
                lastFinish = activities[i].finish;
            }
        }
        // To display the indices of selected activities (as in the sample explanation)
        Collections.sort(selected);
        System.out.print("Selected activities: ");
        for (int idx : selected) System.out.print(idx + " ");
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        System.out.println("Maximum number of activities: "
            + maxActivities(start, finish));
        // Output: Selected activities: 0 1 3 4
        //         Maximum number of activities: 4
    }
}
