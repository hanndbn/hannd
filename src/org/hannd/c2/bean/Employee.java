package org.hannd.c2.bean;

public class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name) {
        setId(id);
        setName(name);
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // setter and getter

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        this.age = age;
        return this;
    }
}