package hw12;

import hw12.MyLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList();
        System.out.println("List is empty - " + list.isEmpty());
        System.out.println(list.getSize());
        String str1 = "first element";
        String str2 = "next element";
        String str3 = "add to index element";
        list.addFirst(str1);
        list.addLast(str2);
        list.replaceElement(2,1);
        list.toPrint();
        list.addToIndex(2, str3);
        list.toPrint();
        list.removeFirst();
        list.removeLast();
        list.removeToIndex(2);
        list.toPrint();
        String[] stgArray = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        MyLinkedList<String> list2 = new MyLinkedList<String>(Arrays.asList(stgArray));
        list2.addFirst("First");
        list2.getSize();
        list2.toPrint();
        list2.replaceElement(1,4);
        list2.toPrint();
    }
}
