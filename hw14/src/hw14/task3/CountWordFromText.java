package hw14.task3;

import java.util.HashMap;

public class CountWordFromText {
    public static HashMap<String, Integer> countWordFromText(String str) {
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        for (String retval : str.split("\\W+")) {
            if (myHashMap.containsKey(retval)) {
                Integer count = myHashMap.get(retval);
                count++;
                myHashMap.put(retval, count);
            } else {
                myHashMap.put(retval, 1);
            }
        }
        return myHashMap;
    }
}
