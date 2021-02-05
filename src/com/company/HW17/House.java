package com.company.HW17;

/*
1)	Создать класс House со следующими полями и методами:
- public поле номер дома;
- private поле количество комнат;
- private поле количество жильцов;
- private поле название дома;
- public метод toString;
- public метод, который возвращает название дома;
- private метод, который увеличивает количество жильцов на 1;
- private метод, который принимает количество жильцов и количество квартир и устанавливает соответствующие поля в
объекте класса;
●	Создать метод, который распечатает информацию о классе с помощью рефлексии:выводит все поля и методы класса.
●	Создать метод, который выводит с помощью рефлексии значения всех полей для объекта класса.
●	Создать метод, который вызывает с помощью рефлексии все методы класса.
 */
public class House {
    public int number;
    private int rooms;
    private int residents;
    private String nameHouse;

    public House(int number, int rooms, int residents, String nameHouse) {
        this.number = number;
        this.rooms = rooms;
        this.residents = residents;
        this.nameHouse = nameHouse;
    }

    private void addResident(){
        residents++;
    }

    private void addResidentAndRoom(int resident, int room){
        this.residents=resident;
        this.rooms=room;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", rooms=" + rooms +
                ", residents=" + residents +
                ", nameHouse='" + nameHouse + '\'' +
                '}';
    }
}
