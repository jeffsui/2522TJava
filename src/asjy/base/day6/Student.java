package asjy.base.day6;

/**
 * 学生类
 */
public  class Student {
    public  String stuName;
    protected  int stuAge = 8;
    protected  double stuScore;

    public Student() {
        super();
        System.out.println("【父类】Student 默认构造");
    }

    public Student(String stuName, int stuAge, double stuScore) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuScore = stuScore;
    }

    public void study(){
        System.out.println(this.stuName+"正在学习.....");
    }

    public void play(){
        System.out.println(this.stuName+"在娱乐.....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuScore=" + stuScore +
                '}';
    }
}
