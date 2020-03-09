package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntNumber {

    public static String sortArrayIntNumber(String textInt) {
        List IntList = new ArrayList();
        for (String retval : textInt.split(",")) {
            IntList.add(Integer.valueOf(retval));
        }
        Collections.sort(IntList);
        return IntList.toString();
    }
}
