package com.company.HW10;
/*
4)	Создать объект Person3 c полями name, surname, age, password(не должно сериализоваться), статическими полем minAllowedAge.
 Сгенерировать 10 объектов класса Person3 со случайными значениями полей соответствующего типа. С помощью сериализации записать их
  в файл и считать их оттуда.
 */
import java.io.Serializable;

public class Person4 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String Name;
    private String surName;
    private int age;
    private String password;
    static int minAllowedAge = 18;

    public Person4(String Name, String surName, int age, String password) {
        this.Name = Name;
        this.surName = surName;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String value) {
        Name = value;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String value) {
        surName = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        age = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        password = value;
    }

    @Override
    public String toString() {
        return "[Person4: firstName = " + Name + " lastName = " + surName + " age = " + age + " spouse = " + password + "]";
    }
}
