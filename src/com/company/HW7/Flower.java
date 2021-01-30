package com.company.HW7;

/*
1) Создать объект класса Цветок и классы Лепесток, Бутон, Стебель, Лист.
Методы: расцвести, завять, расти, вывести на консоль цвет бутона.
спользовать вложенные классы.
 */

public class Flower {
    private final String flower1;

    public Flower(String flower1) {
        this.flower1 = flower1;
    }

    public static void main(String[] args) {
        Flower flower = new Flower ( "Роза" );
        Flower.Bud bud1 = flower.new Bud ( "красного" );

        Flower.Stem stem1 = flower.new Stem ();
        stem1.grow ();

        Flower.Petal petal1 = flower.new Petal ();
        petal1.grow ();

        Flower.Sheet sheet1 = flower.new Sheet ();
        sheet1.grow ();

        bud1.colourBud ();
    }

    public class Bud {
        private final String colour;

        public Bud(String colour) {
            this.colour = colour;
        }

        public void colourBud() {
            System.out.println ( "Бутон цветка " + flower1 + " " + colour + " цвета" );
        }
    }

    public class Petal {
        public void grow() {
            System.out.println ( "Лепестки растут" );
        }
    }

    public class Stem {
        public void grow() {
            System.out.println ( "Стебель растёт" );
        }
    }

    public class Sheet {
        public void grow() {
            System.out.println ( "Листы растут" );
        }

        public void withe() {
            System.out.println ( "Цветок завял" );
        }
    }
}

