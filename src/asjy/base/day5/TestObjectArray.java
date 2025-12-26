package asjy.base.day5;

public class TestObjectArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Jack",20);
        Student s3 = new Student("Mick",'女',23);
        //对象数组
        Student[] stuArr = {s1,s2,s3};
        System.out.println(stuArr);
        System.out.println(stuArr.length);
        for (Student stu: stuArr){
            stu.show();
        }
    }
}
