package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer [] data ={2,2,3,4,5,7,7,8,9,2,2,3,5,7};
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i],histogram.containsKey(data[i]) ? histogram.get(data[i])+1: 1);
        }
        
        Iterator<Map.Entry<Integer,Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key = "+ entry.getKey() + ",Value = "+ entry.getValue());
        }
    }
    
}
