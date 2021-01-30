package com.company.HW7;

/*
2) Создать классы Car и Motorcycle, которые наследуются от общего класса
Vehicle. Создать поле name в классе Vehicle и проинициализировать его через
конструктор. Создать generic класс Garage, который может хранить только
объекты типа наследуемого от Vehicle. Создать 2 объекта класса Garage
(все поля ввести с клавиатуры) и вывести на экран имя хранимого
транспортного средства.
 */

public abstract class Vehicle { // создали общий класс Vehicle
    private String name;
    private int numberOfWheels;

    public Vehicle(String name, int numberOfWheels) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
    }

    public static void main(String[] args) {
        Garage<String> vehicle1 = new Garage<> ( "Запорожец ", -4 );
        Garage<String> vehicle2 = new Garage<> ( "Ява ", -2 );

        vehicle1.nameVehicle2 ();
        vehicle2.nameVehicle2 ();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public static class Garage<T> extends Vehicle { //Создать generic класс Garage, который может хранить
        // только объекты типа наследуемого от Vehicle.

        public Garage(String name, int numberOfWheels) {
            super ( name, numberOfWheels );
        }

        public void nameVehicle2() {
            System.out.println ( getName () + getNumberOfWheels () );
        }
    }

    public class Car extends Vehicle { //Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
        public Car(String name, int numberOfWheels) {
            super ( name, numberOfWheels );
        }
    }

    public class Motorcycle extends Vehicle { //Создать классы Car и Motorcycle, которые наследуются от общего
        // класса Vehicle.
        public Motorcycle(String name, int numberOfWheels) {
            super ( name, numberOfWheels );
        }
    }
}