import java.util.*;

class Solution {
    public String solution(String S, int K) {
        // Define the days of the week
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // Creates a map for constant-time lookup of day indices
        Map<String, Integer> dayIndexMap = new HashMap<>();
        for (int i = 0; i < daysOfWeek.length; i++) {
            dayIndexMap.put(daysOfWeek[i], i);
        }

        // Finds the index of the given day
        int initialDayIndex = dayIndexMap.get(S);

        // Calculates the index of the day K days later using modulo
        int targetDayIndex = (initialDayIndex + K) % 7;

        // Ensures the result is non-negative
        targetDayIndex = (targetDayIndex + 7) % 7;

        // Returns the day of the week K days later
        return daysOfWeek[targetDayIndex];
    }
}

