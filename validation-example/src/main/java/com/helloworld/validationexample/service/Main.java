package com.helloworld.validationexample.service;

import java.util.HashMap;

public class Main {
    public static  void main(String args[]){
        Employee employee = new Employee(1,"Niraj",1);
        Employee employee1 = new Employee(1,"Niraj",2);

        HashMap<Employee,String> empHashMap =  new HashMap<>();
        empHashMap.put(employee1,"emp1");
        empHashMap.put(employee,"emp");
        System.out.println("Employee object is :::::"+employee.equals(employee1));
        System.out.println("empHashMap is ::"+empHashMap);
    }
}
