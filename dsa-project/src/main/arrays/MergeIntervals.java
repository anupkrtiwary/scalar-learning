package main.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    /**
     * Merges sorted intervals (by start) and returns non-overlapping merged intervals.
     * Assumes intervals is a 2D array where intervals[i] = [start, end] and start <= end.
     */
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][];

        List<int[]> merged = new ArrayList<>();
        int curStart = intervals[0][0];
        int curEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if (s <= curEnd) {
                // overlap, extend current end if needed
                if (e > curEnd) curEnd = e;
            } else {
                // no overlap, push current and start new
                merged.add(new int[] {curStart, curEnd});
                curStart = s;
                curEnd = e;
            }
        }
        // add last interval
        merged.add(new int[] {curStart, curEnd});

        return merged.toArray(new int[merged.size()][]);
    }

    // Example usage
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };
        int[][] out = merge(intervals);
        for (int[] iv : out) System.out.println(Arrays.toString(iv));

        int[][] intervals2 = { {1,4}, {4,5} };
        System.out.println("---");
        for (int[] iv : merge(intervals2)) System.out.println(Arrays.toString(iv));
    }
}
