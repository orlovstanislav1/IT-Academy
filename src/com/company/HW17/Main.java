package com.company.HW17;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        House house = new House(1, 4, 5, "House1");
        infoClass(house);
        System.out.println();
        infoFields(house);
        System.out.println();
        startMethods(house);
        infoFields(house);
    }

    public static void infoClass(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        Method[] methods = obj.getClass().getDeclaredMethods();
        System.out.println("Методы класса:");
        for (Method method : methods) {
            System.out.println("\t" + method);
        }
        System.out.println("Поля класса:");
        for (Field field : fields) {
            System.out.println("\t" + field.getName());
        }
    }

    public static void infoFields(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            try {
                field.setAccessible(true);
                System.out.println("\t" + field.getName() + " = " + field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }

    public static void startMethods(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> {
            try {
                method.setAccessible(true);
                if (method.getName().equals("addResidentAndRoom"))
                    method.invoke(obj, 1, 1);
                else
                    method.invoke(obj);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }
}
