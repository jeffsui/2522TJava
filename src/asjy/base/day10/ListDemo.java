package asjy.base.day10;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        /**
         * 泛型
         */
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(0,9);
        System.out.println(list1.size());
        System.out.println(list1);
        list1.remove(new Integer(9));
        System.out.println(list1.size());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(3);
        list2.forEach(e->{
            System.out.println(e);
        });
        list2.remove(Integer.valueOf(3));
        System.out.println(list2+",size:"+list2.size());
        list2.add(Integer.valueOf(4));
        System.out.println(list2+",size:"+list2.size());


    }
}
