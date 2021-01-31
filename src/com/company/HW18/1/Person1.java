package com.company.HW18;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

@com.company.HW18.SignCode(type = com.company.HW18.Type.CLASS, id = 2)
public class Person1 {
    @com.company.HW18.SignCode(type = com.company.HW18.Type.FIELD, id = 3)
    private String name;
    @com.company.HW18.SignCode(type = com.company.HW18.Type.FIELD, id = 4)
    private String surname;
    @com.company.HW18.SignCode(type = com.company.HW18.Type.FIELD, id = 5)
    private int year;

    @com.company.HW18.SignCode(type = com.company.HW18.Type.CONSTRUCTOR, id = 6)
    public Person1(
            @com.company.HW18.SignCode(type = com.company.HW18.Type.PARAMETER, id = 7)
                    String name,
            @com.company.HW18.SignCode(type = com.company.HW18.Type.PARAMETER, id = 8)
                    String surname,
            @com.company.HW18.SignCode(type = com.company.HW18.Type.PARAMETER, id = 9)
                    int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public static void method() {
        Class c = Person1.class;
        Method[] methods = c.getDeclaredMethods ();
        Field[] fields = c.getDeclaredFields ();
        Package aPackage = c.getPackage ();
        Constructor[] constructors = c.getConstructors ();


        Arrays.stream ( fields )
                .filter ( field -> !Modifier.isStatic ( field.getModifiers () ) )
                .forEach ( field -> {
                    field.setAccessible ( true );
                    com.company.HW18.SignCode signCode = field.getAnnotation ( com.company.HW18.SignCode.class );
                    System.out.println ( field.getName () + "[type:" + signCode.type () + ", id:" + signCode.id () +
                            "]" );
                } );

        Arrays.stream ( constructors )
                .filter ( constructor -> !Modifier.isStatic ( constructor.getModifiers () ) )
                .forEach ( constructor -> {
                    constructor.setAccessible ( true );
                    com.company.HW18.SignCode signCode = (com.company.HW18.SignCode) constructor.getAnnotation ( com.company.HW18.SignCode.class );
                    System.out.println ( constructor.getName () + "[type:" + signCode.type () + ", id:" + signCode.id () + "]" );

                    Annotation[][] paramAnnotations = constructor.getParameterAnnotations ();
                    Class[] paramTypes = constructor.getParameterTypes ();
                    int i = 0;
                    for (Annotation[] annotations : paramAnnotations) {
                        Class parameterType = paramTypes[i++];
                        for (Annotation annotation : annotations) {
                            com.company.HW18.SignCode signCode1 = (com.company.HW18.SignCode) annotation;
                            System.out.println ( parameterType.getName ()
                                    + "[type:" + signCode1.type ()
                                    + ", id:" + signCode1.id () + "]" );
                        }
                    }
                } );

        Arrays.stream ( methods )
                .filter ( method -> !Modifier.isStatic ( method.getModifiers () ) )
                .forEach ( method -> {
                    method.setAccessible ( true );
                    com.company.HW18.SignCode signCode = method.getAnnotation ( com.company.HW18.SignCode.class );
                    System.out.println ( method.getName () + "[type:" + signCode.type () + ", id:" + signCode.id () + "]" );
                } );

        com.company.HW18.SignCode signCode = aPackage.getAnnotation ( com.company.HW18.SignCode.class );
        System.out.println ( aPackage.getName () + "[type:" + signCode.type () + ", id:" + signCode.id () + "]" );
    }

    @com.company.HW18.SignCode(type = com.company.HW18.Type.METHOD, id = 1)
    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                '}';
    }
}
