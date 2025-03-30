package com.demo.nonlinear_ds.hashtable;

import java.util.Hashtable;

public class EmployeeRecords {
    public static void main(String[] args) {
        Hashtable<Integer, String> employees = new Hashtable<>();

        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        System.out.println("Employee 102: " + employees.get(102));

        // Iterating over Hashtable
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }
    }
}
