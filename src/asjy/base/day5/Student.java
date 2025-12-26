package asjy.base.day5;

public class Student {
    private String name;
    private char sex;
    private double score ;
    public Student(){
        System.out.println("默认无参构造");
        this.name = "佚名";
        this.sex=  '男';
        this.score = 60;
    }
    public Student(String name,double score){
        this();
        this.name = name;
        this.score = score;
    }

    public Student(String name,char sex,double score){
//        this.name = name;
//        this.score = score;
        this(name,score);
        this.sex = sex;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getScore(){ //只读
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }

    static final String origin = "中国人"; //static 共享变量/常量:

    void play(){
        System.out.println(name+"在玩游戏...");
    }
    void study(){
        System.out.println(name+"在学习....");
        this.play();
    }

    void show(){
        System.out.printf("姓名:%s,性别:%c,成绩:%.1f\n",this.name,this.sex,this.score);
    }
}
