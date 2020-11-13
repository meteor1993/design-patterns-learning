package com.geekdigging.chapter10.dress;

public abstract class ClothesDecorator extends Person {
    private Person person;

    public ClothesDecorator(Person person) {
        this.person = person;
    }

    @Override
    void dress() {
        this.person.dress();
    }
}
