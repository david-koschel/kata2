package kata2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] data = new int[]{1, 2, 3, 4, 6, 1, 3, 65, 3, 2, 11, 5, 3, 1, 1};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);

        Map<Integer,Integer> histogr = histogramGenerator.getHistogram();

        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "==>" + histogr.get(entry.getKey()));
        }
    }
}