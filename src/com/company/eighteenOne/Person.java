package com.company.eighteenOne;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

@SignCode(type = Type.CLASS, id = 2)
public class Person {
    @SignCode(type = Type.FIELD, id = 3)
    private String name;
    @SignCode(type = Type.FIELD, id = 4)
    private String surname;
    @SignCode(type = Type.FIELD, id = 5)
    private int year;

    @SignCode(type = Type.CONSTRUCTOR, id = 6)
    public Person(
            @SignCode(type = Type.PARAMETER, id = 7)
                    String name,
            @SignCode(type = Type.PARAMETER, id = 8)
                    String surname,
            @SignCode(type = Type.PARAMETER, id = 9)
                    int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public static void method() {
        Class c = Person.class;
        Method[] methods = c.getDeclaredMethods();
        Field[] fields = c.getDeclaredFields();
        Package aPackage = c.getPackage();
        Constructor[] constructors = c.getConstructors();


        SignCode ann = (SignCode) c.getAnnotation(SignCode.class);
        System.out.println(c.getName() + "[type:" + ann.type() + ", id:" + ann.id() + "]");

        Arrays.stream(fields)
                .filter(field -> !Modifier.isStatic(field.getModifiers()))
                .forEach(field -> {
                    field.setAccessible(true);
                    SignCode signCode = field.getAnnotation(SignCode.class);
                    System.out.println(field.getName() + "[type:" + signCode.type() + ", id:" + signCode.id() + "]");
                });

        Arrays.stream(constructors)
                .filter(constructor -> !Modifier.isStatic(constructor.getModifiers()))
                .forEach(constructor -> {
                    constructor.setAccessible(true);
                    SignCode signCode = (SignCode) constructor.getAnnotation(SignCode.class);
                    System.out.println(constructor.getName() + "[type:" + signCode.type() + ", id:" + signCode.id() + "]");

                    Annotation[][] paramAnnotations = constructor.getParameterAnnotations();
                    Class[] paramTypes = constructor.getParameterTypes();
                    int i = 0;
                    for (Annotation[] annotations : paramAnnotations) {
                        Class parameterType = paramTypes[i++];
                        for (Annotation annotation : annotations) {
                            SignCode signCode1 = (SignCode) annotation;
                            System.out.println(parameterType.getName()
                                    + "[type:" + signCode1.type()
                                    + ", id:" + signCode1.id() + "]");
                        }
                    }
                });

        Arrays.stream(methods)
                .filter(method -> !Modifier.isStatic(method.getModifiers()))
                .forEach(method -> {
                    method.setAccessible(true);
                    SignCode signCode = method.getAnnotation(SignCode.class);
                    System.out.println(method.getName() + "[type:" + signCode.type() + ", id:" + signCode.id() + "]");
                });

        SignCode signCode = aPackage.getAnnotation(SignCode.class);
        System.out.println(aPackage.getName() + "[type:" + signCode.type() + ", id:" + signCode.id() + "]");
    }

    @SignCode(type = Type.METHOD, id = 1)
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                '}';
    }
}
