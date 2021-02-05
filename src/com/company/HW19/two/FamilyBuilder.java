package com.company.HW19.two;

public class FamilyBuilder {
    private Family family = new Family();

    public FamilyBuilder addLastName(String lastName) {
        family.setLastName(lastName);
        return this;
    }

    public FamilyBuilder addMother(Person mother) {
        family.setMother(mother);
        return this;
    }

    public FamilyBuilder addFather(Person father) {
        family.setFather(father);
        return this;
    }

    public FamilyBuilder addChildren(Person child) {
        family.setChildren(child);
        return this;
    }

    public Family createFamily() {
        Family newFamily = family;
        family = null;
        return newFamily;
    }

}
