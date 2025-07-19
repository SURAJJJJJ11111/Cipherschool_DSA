import java.util.Arrays;

public class Qestion24_2 {
       static class Job {
        int deadline;
        int profit;
        Job(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static int[] jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        Job[] jobs = new Job[n];
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadline[i], profit[i]);
            if (deadline[i] > maxDeadline) maxDeadline = deadline[i];
        }

        // Sort jobs by descending profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Time slots (false = slot unoccupied), only need up to maxDeadline slots
        boolean[] slot = new boolean[maxDeadline + 1];
        int count = 0, totalProfit = 0;

        for (Job job : jobs) {
            // Try to schedule in latest available slot prior to deadline
            for (int j = job.deadline; j > 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    count++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }
        return new int[]{count, totalProfit};
    }

    public static void main(String[] args) {
        int[] deadline1 = {4, 1, 1, 1};
        int[] profit1   = {20, 10, 40, 30};
        int[] result1 = jobSequencing(deadline1, profit1);
        System.out.println(Arrays.toString(result1)); // [2, 60]

        int[] deadline2 = {2, 1, 2, 1, 1};
        int[] profit2   = {100, 19, 27, 25, 15};
        int[] result2 = jobSequencing(deadline2, profit2);
        System.out.println(Arrays.toString(result2)); // [2, 127]

        int[] deadline3 = {3, 1, 2, 2};
        int[] profit3   = {50, 10, 20, 30};
        int[] result3 = jobSequencing(deadline3, profit3);
        System.out.println(Arrays.toString(result3)); // [3, 100]
    }
    
}
