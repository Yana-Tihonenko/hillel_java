package hw17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        String text = "Who is top dog of the California waves?" +
                "About 50 animals wearing life jackets took part in the annual dog surfing competition in San Diego." +
                "They were eager to follow their owners to the water and looked pretty confident and skilled at keeping their balance on the surfboards." +
                "The owners guarantee that their pets are safe and enjoying the ride. ";
                //task1
        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        for (String retval : text.split("\\W+")) {
            if (myHashMap.containsKey(retval)) {
                Integer count = myHashMap.get(retval);
                count++;
                myHashMap.put(retval, count);
            } else {
                myHashMap.put(retval, 1);
            }
        }
        myHashMap.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


            //task2
        int indexreplace = 5;
        char newsymbol = '?';
        String s = Arrays.stream(text.split("\\W+"))
                .map(StringBuilder::new)
                .peek(x -> {
                    if (x.length() >= indexreplace) x.insert(indexreplace - 1, newsymbol);
                }).collect(Collectors.joining(" "));
        System.out.println(s);

        //task3
        String newList =Stream.of(text.split("\\W+"))
                .map(StringBuilder::new)
                .filter(x -> x.charAt(0) == x.charAt(x.length()-1))
                .distinct()
                .collect(Collectors.joining(" "));
        System.out.println(newList);

        //task4
        Pattern prt4 = Pattern.compile("[,\\.\\!\\?\\:]");
        Matcher matcher4 = prt4.matcher(text);
        int countintpunctuationMarks = 0;
        while (matcher4.find()) {
            countintpunctuationMarks++;
        }
        System.out.println(countintpunctuationMarks);
    }
}
