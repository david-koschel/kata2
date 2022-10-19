package kata2;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};

        HistogramGenerator<String> histogramGenerator = new HistogramGenerator<>(data);

        Map<String,Integer> histogr = histogramGenerator.getHistogram();

        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "==>" + histogr.get(entry.getKey()));
        }
    }
}