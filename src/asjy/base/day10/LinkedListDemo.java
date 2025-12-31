package asjy.base.day10;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("aaa");
        linkedList.add("ccc");
        linkedList.addLast("eee");
        linkedList.addFirst("fff");
        System.out.println(linkedList+",size"+linkedList.size());
    }
}
