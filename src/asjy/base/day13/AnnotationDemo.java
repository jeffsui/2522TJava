package asjy.base.day13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Info(author = "Jeff", date = "2026-01-06", version = 2, reviewers = {"Alice","Bob"})
public class AnnotationDemo {

    @Info(author = "Jeff", date = "2026-01-06")
    public void hello() {
        System.out.println("hello");
    }

    @Info(author = "Jeff")
    private String secret;

    public static void main(String[] args) throws Exception {
        Class<AnnotationDemo> clazz = AnnotationDemo.class;

        // read annotation on class
        if (clazz.isAnnotationPresent(Info.class)) {
            Info info = clazz.getAnnotation(Info.class);
            System.out.println("Class Info -> author: " + info.author() + ", date: " + info.date() + ", version: " + info.version());
        }

        // read annotations on methods
        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Info.class)) {
                Info info = m.getAnnotation(Info.class);
                System.out.println("Method " + m.getName() + " -> author: " + info.author());
            }
        }

        // read annotations on fields
        for (Field f : clazz.getDeclaredFields()) {
            if (f.isAnnotationPresent(Info.class)) {
                Info info = f.getAnnotation(Info.class);
                System.out.println("Field " + f.getName() + " -> author: " + info.author());
            }
        }
    }
}
