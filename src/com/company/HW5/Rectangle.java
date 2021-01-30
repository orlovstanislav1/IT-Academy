package com.company.HW5;

public class Rectangle {
    int lenght;
    int width;

    public Rectangle() {
        this(4, 3);
    }

    public Rectangle(int lengh, int width) {
        this.width = width;
        this.lenght = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.perimetr());
    }

    public int perimetr() {
        return (lenght + width) * 2;
    }
}
