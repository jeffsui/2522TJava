package asjy.base.day5;

public class TestStu {
    public static void main(String[] args) {
        //类的实例化  引用类型
        // 类是一种类型,对象是类的具体示例
        // 对象是类实例化的结果
//        System.out.println(Student.origin);
//        Student.origin = "美国人";//不能被修改
        Student stu1 = new Student();
        System.out.println(stu1);
        //对象的成员如何访问 对象名.属性名
//        stu1.name = "小明";
//        stu1.sex = '男';
//        stu1.score = 98.5;
        stu1.setScore(66);
        System.out.println(stu1.getScore());
        //调用对象中的方法 对象名.方法名()
        stu1.show();
//        stu1.play();
        stu1.study();

        Student stu2 = new Student();
        System.out.println(stu2);
//        stu2.name = "小红";
        stu2.study();
        System.out.println(stu2.origin);

        Student stu3 = new Student();
        stu3.show();


    }
}
