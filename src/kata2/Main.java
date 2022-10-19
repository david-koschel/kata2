package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] data = new int[]{1, 2, 3, 4, 6, 1, 3, 65, 3, 2, 11, 5, 3, 1, 1};
        Map<Integer, Integer> histogram = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + histogram.get(entry.getKey()));
        }
    }
}