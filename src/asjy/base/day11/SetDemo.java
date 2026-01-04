package asjy.base.day11;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        /**
         *
         */
        Set<String> set1 = new HashSet<>();
        set1.add("bbb");
        set1.add("aaa");
        set1.add("ccc");
        System.out.println(set1); //无序
        System.out.println("size:"+set1.size());
        set1.remove("aaa"); //移除某个元素
        System.out.println(set1);
        set1.clear();
        System.out.println("size:"+set1.size());

        //利用元素不重复的特性,去重
        List<Integer> list1 = new ArrayList<>() ;
        list1.add(111);
        list1.add(222);
        list1.add(333);
        list1.add(111);
        System.out.println(list1);
        Set<Integer> set2 = new HashSet<>(list1);
        System.out.println(set2);

        Iterator<Integer> iterator = set2.iterator();
        for (;iterator.hasNext();){
            Integer next = iterator.next();
            System.out.println(next);

        }


    }
}
