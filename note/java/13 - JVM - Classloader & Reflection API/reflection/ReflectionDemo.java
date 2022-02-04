package com.antra.corejava.reflection;

import com.antra.corejava.reflection.pojo.A;
import com.antra.corejava.reflection.pojo.B;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws NoSuchMethodException {
        A a = new A(999, "Antra", true);
        B b = new B();
        System.out.println("Before " + b);
        copyProperties(a, b);
        System.out.println("After  " + b);
    }

    private static void copyProperties(Object source, Object target) throws NoSuchMethodException {
        Class classSource = source.getClass();
        Class classTarget = target.getClass();
        Field[] fields = classSource.getDeclaredFields();
        for (Field f : fields) {
            String fieldNameInSource = f.getName();
            String getter = "get" + Character.toUpperCase(fieldNameInSource.charAt(0)) + fieldNameInSource.substring(1);
            Method getterMethod = classSource.getMethod(getter);
//            f.setAccessible(true);
            try {
               Field fieldInTarget = classTarget.getDeclaredField(fieldNameInSource);
               String setter = "set" + Character.toUpperCase(fieldNameInSource.charAt(0)) + fieldNameInSource.substring(1);
//               fieldInTarget.setAccessible(true);
                Method setterMethod = classTarget.getMethod(setter, f.getType());
//               fieldInTarget.set(target, f.get(source));
                setterMethod.invoke(target, getterMethod.invoke(source));
            } catch (NoSuchFieldException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}

// copy all the properties from Object A -> B
// A doesn't have any relation B

