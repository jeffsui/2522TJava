package asjy.base.day10;

import java.util.ArrayList;
import java.util.Comparator;

public class ListObjectDemo {
    public static void main(String[] args) {
        ArrayList<Student> listStu = new ArrayList<>();
        listStu.add(new Student("Jack",19));
        listStu.add(new Student("Rose",20));
        listStu.add(new Student("Mick",18));
        System.out.println(listStu);
        listStu.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getScore(),o2.getScore());
                return Double.compare(o2.getScore(),o1.getScore());
            }
        });
        System.out.println("排序后");
        for (int i = 0; i <listStu.size() ; i++) {
            System.out.println(listStu.get(i));
        }

    }
}
