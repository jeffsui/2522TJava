package asjy.base.day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("BBB");
        list1.add("CCC");
        list1.add("aaa");
        for (String str : list1){
            System.out.println(str);
        }
        //迭代器实现
        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);

        }
    }
}
