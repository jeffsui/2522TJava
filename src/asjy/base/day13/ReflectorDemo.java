// java
package asjy.base.day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class ReflectorDemo {
    public static void main(String[] args) {
        try {
            Class<User> clazz = User.class;
            System.out.println(clazz);

            // 1. List fields
            System.out.println("Fields:");
            for (Field f : clazz.getDeclaredFields()) {
                System.out.printf("  %s : %s%n", f.getName(), f.getType().getSimpleName());
            }

            // 2. List methods
            System.out.println("\nMethods:");
            for (Method m : clazz.getDeclaredMethods()) {
                System.out.printf("  %s(%d params) : %s%n", m.getName(), m.getParameterCount(), m.getReturnType().getSimpleName());
            }

            // 3. List constructors
            System.out.println("\nConstructors:");
            for (Constructor<?> c : clazz.getDeclaredConstructors()) {
                System.out.printf("  %s(%d params)%n", c.getName(), c.getParameterCount());
            }

            // 4. Create instance using no-arg constructor and call setters
            Object u1 = clazz.getDeclaredConstructor().newInstance();
            Method setName = clazz.getMethod("setName", String.class);
            Method setPassword = clazz.getMethod("setPassword", String.class);
            Method setAddtime = clazz.getMethod("setAddtime", Date.class);
            setName.invoke(u1, "Alice");
            setPassword.invoke(u1, "alice123");
            setAddtime.invoke(u1, new Date());
            System.out.println("\nInstance u1 via no-arg ctor: " + u1);

            // 5. Create instance using (String, String) constructor
            Constructor<User> ctor = clazz.getConstructor(String.class, String.class);
            User u2 = ctor.newInstance("Bob", "bobpwd");
            System.out.println("Instance u2 via (String,String) ctor: " + u2);

            // 6. Access & modify private field 'id'
            Field idField = clazz.getDeclaredField("id");
            idField.setAccessible(true); // allow private access
            idField.setInt(u2, 42);
            Method getId = clazz.getMethod("getId");
            System.out.println("u2.id after reflectively set: " + getId.invoke(u2));

            // 7. Create instance using full constructor (int, String, String, Date)
            Constructor<User> fullCtor = clazz.getConstructor(int.class, String.class, String.class, Date.class);
            User u3 = fullCtor.newInstance(7, "Carol", "cpass", new Date());
            System.out.println("Instance u3 via full ctor: " + u3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

