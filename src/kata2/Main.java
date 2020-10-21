package kata2;

import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String [] data = {"maria","pepe","pedro","maria","pepe","pepe","ana","pedro","maria","facundo"};
        Histogram meta_histogram = new Histogram(data);
        Map<Integer,Integer> histogram = meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer,Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = "+ entry.getKey() + ",Value = "+ entry.getValue());
        }
    }
    
}
