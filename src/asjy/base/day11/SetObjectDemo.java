package asjy.base.day11;

import java.util.HashSet;
import java.util.Set;

public class SetObjectDemo {
    public static void main(String[] args) {
        Teacher t1= new Teacher("隋","Java");
        Teacher t2= new Teacher("王","SQL");
        Teacher t3= new Teacher("隋","Java");
        Set<Teacher> teacherSet = new HashSet<>();
        teacherSet.add(t1);
        teacherSet.add(t2);
        teacherSet.add(t3);
        System.out.println(teacherSet); //此处 不会认定 两个对象 统一个对象

        System.out.println("对象比较地址"+(t1 == t3));
        System.out.println("对象比较值(重写equals)"+(t1.equals(t3)));

    }
}
