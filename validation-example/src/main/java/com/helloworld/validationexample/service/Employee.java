package com.helloworld.validationexample.service;

public class Employee {
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if((obj == null) || (getClass()!= obj.getClass()))
            return false;
        Employee other =  (Employee)obj;
      return this.age == other.age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
