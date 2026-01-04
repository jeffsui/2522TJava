package asjy.base.day11;

import java.util.Objects;

public class Teacher {
    private String name; //老师名字
    private String course;

    public Teacher() {
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }
    //课程

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Teacher)) return false;

        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(course, teacher.course);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(course);
        return result;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println(t1.getClass());
    }
}
