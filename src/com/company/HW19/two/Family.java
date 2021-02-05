package com.company.HW19.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {
    private String lastName;
    private Person mother;
    private Person father;
    private List<Person> children = new ArrayList<>();

    public Family(String lastName, Person mother, Person father, Person... args) {
        this.lastName = lastName;
        this.mother = mother;
        this.father = father;
        this.children = Arrays.asList(args.clone());
    }

    public Family() {
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(Person child) {
        children.add(child);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
