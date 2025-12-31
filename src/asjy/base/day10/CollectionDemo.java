package asjy.base.day10;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c1 = null;
        c1 = new ArrayList();
        //add 添加元素
        c1.add(new Integer(2));
        c1.add(3);  //自动装箱在起作用
        c1.add(1);
        System.out.println(c1+",size:"+c1.size());
        c1.remove(3);
        System.out.println(c1+",size:"+c1.size());
        Collection c2 = new ArrayList();
        c2.add(4);
        c2.add(5);
        c1.addAll(c2);
        System.out.println(c1+",size:"+c1.size());
        c1.removeAll(c2);
        System.out.println(c1+",size:"+c1.size());
        System.out.println("是否包含2："+c1.contains(2));
        System.out.println("是否空集合"+c1.isEmpty());
        c1.add(4);
        System.out.println(c1+",size:"+c1.size());
        c1.add(4);
        System.out.println(c1+",size:"+c1.size());



    }
}
