package com.company.HW15;
/*
 *Создайте класс Person1 с полями: имя, фамилия, год рождения. Реализуйте у этого класса
 * паттерн Builder(Строитель).
 * Введите поля с клавиатуры и заполните объект класса Person1 с помощью паттерна
 * Строитель.
 * */

public class Main3 {

    public static void main(String[] args) {
        Person person1 = new Person.Builder ( "STAS" ).setSurname ( "ORLOV" ).setYearOfBirth ( 1989 ).build ();
        System.out.println ( person1 );

        Person person2 = new Person.Builder ( "IVAN" ).setSurname ( "IVANOV" ).build ();
        System.out.println ( person2 );

        Person person3 = new Person.Builder ( "PETR" ).build ();
        System.out.println ( person3 );

        Person person4 = new Person.Builder ( "VASIA" ).setYearOfBirth ( 1984 ).build ();
        System.out.println ( person4 );
    }
}

class Person {
    private String name;
    private String surname;
    private int yearOfBirth;

    public Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.yearOfBirth = builder.yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        if (surname != null && yearOfBirth != 0) {
            return "Person1{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", yearOfBirth=" + yearOfBirth +
                    '}';
        } else if (surname != null && yearOfBirth == 0) {
            return "Person1{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        } else if (surname == null && yearOfBirth != 0) {
            return "Person1{" +
                    "name='" + name + '\'' +
                    ", yearOfBirth=" + yearOfBirth +
                    '}';
        } else
            return "Person1{" +
                    "name='" + name + '\'' +
                    '}';
    }

    static class Builder {
        private String name;
        private String surname;
        private int yearOfBirth;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
            return this;
        }

        public Person build() {
            return new Person ( this );
        }
    }
}

