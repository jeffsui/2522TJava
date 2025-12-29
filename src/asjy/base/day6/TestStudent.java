package asjy.base.day6;

public class TestStudent {
    public static void main(String[] args) {
        /**
         * 任何类默认继承自Object类
         * 构造方法执行顺序: 先父再子
         */
        Student student = new Student();
        System.out.println(student);
        LittleStudent littleStudent = new LittleStudent();
        System.out.println(littleStudent);
        littleStudent.stuName = "小明";
        littleStudent.stuAge = 15;
//        System.out.println(littleStudent.stuName + ",age:"+littleStudent.stuAge);
        littleStudent.study();
//        littleStudent.play();

//        MiddleStudent middleStudent = new MiddleStudent(13);
//        middleStudent.study();


    }
}
