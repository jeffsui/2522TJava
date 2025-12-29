package asjy.base.day6;



public class LittleStudent extends Student{
    private String schoolName;
    public LittleStudent(){
        System.out.println("子类LittleStudent 默认构造");
    }
    public LittleStudent(String stuName,int stuAge,double stuScore,String schoolName){
//        this.stuName = stuName;
//        this.stuAge = stuAge;
//        this.stuScore = stuScore;
        super(stuName,stuAge,stuScore);
        this.schoolName  = schoolName;
    }

    /**
     * 重写父类方法
     */
    @Override
    public void study(){
        System.out.println("年龄是"+super.stuAge+"岁,放学后不写作业");

    }

    public void play(){
        System.out.println(this.stuName+"就是玩....");
    }

    @Override
    public String toString() {
        return "LittleStudent{" +
                "schoolName='" + schoolName + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuScore=" + stuScore +
                '}';
    }
}
