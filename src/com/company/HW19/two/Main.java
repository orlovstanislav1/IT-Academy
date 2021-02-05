package com.company.HW19.two;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Создать класс Person с полями firstname, age.
 * Создать класс Family c полями типа Person mother, father, список children, строка lastname.
 * Создать список объектов класса Family и записать его в json. Название json файла,
 * в который будет записываться список, передавать программе как параметр.
 */
public class Main {
    public static void main(String[] args) {
        List<Family> families = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            families.add(new FamilyBuilder()
                    .addLastName("Family" + i)
                    .addFather(new Person("Father" + i, new Random().nextInt(20) + 18))
                    .addMother(new Person("Mather" + i, new Random().nextInt(20) + 18))
                    .addChildren(new Person("Child1-" + i, new Random().nextInt(5) + 5))
                    .addChildren(new Person("Child2-" + i, new Random().nextInt(5) + 5))
                    .createFamily());
        }
        File file = new File("E:\\PROGRAMMING\\Progi\\java-project\\IT-Academy\\src\\com\\company\\HW19\\two\\families.json");
        try {
            jsonWriter(families, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void jsonWriter(List<Family> families, File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        objectMapper.writeValue(file, families);
    }
}
