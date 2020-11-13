package com.geekdigging.chapter10.dress;

public abstract class Clothes extends Person {
    private Person person;

    public Clothes(Person person) {
        this.person = person;
    }

    @Override
    void dress() {
        this.person.dress();
    }
}
