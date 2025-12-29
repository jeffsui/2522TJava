package asjy.base.day6.other;

import asjy.base.day6.LittleStudent;
import asjy.base.day6.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.stuName);
        MiddleStudent littleStudent = new MiddleStudent();
        System.out.println(littleStudent.stuName);

    }
}
