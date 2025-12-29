package asjy.base.day6.other;

import asjy.base.day6.Student;

public class MiddleStudent extends Student {
    public MiddleStudent(){
        System.out.println("子类 MiddleStudent 默认无参构造");
    }

    public MiddleStudent(int stuAge ){
        System.out.println("子类 MiddleStudent 一个参数构造");
        this.stuAge = 13;
    }

    public MiddleStudent(String stuName, int stuAge, double stuScore) {
        super(stuName, stuAge, stuScore);
    }

    public void getup(){
        final int number=100 ;

    }
    @Override
    public void study() {
        System.out.println(this.stuAge+"岁,放学后写2个小时");
    }

    public static void main(String[] args) {
        MiddleStudent middleStudent = new MiddleStudent();
        System.out.println(middleStudent.stuScore);
        Student student = new Student();
        System.out.println(student);
    }
}
