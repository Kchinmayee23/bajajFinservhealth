package com.example.javaassignment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaAssignmentApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JavaAssignmentApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Print your details
        System.out.println("=== Bajaj Finserv Java Assignment ===");
        System.out.println("Name       : Chinmaye");
        System.out.println("RegNo      : 22BCE8166");
        System.out.println("Email      : chinmayeekaranam2005@gmail.com");

        // SQL Query
        String finalQuery =
                "SELECT e1.EMP_ID, " +
                "e1.FIRST_NAME, " +
                "e1.LAST_NAME, " +
                "d.DEPARTMENT_NAME, " +
                "COUNT(e2.EMP_ID) AS YOUNGER_EMPLOYEES_COUNT " +
                "FROM EMPLOYEE e1 " +
                "JOIN DEPARTMENT d ON e1.DEPARTMENT = d.DEPARTMENT_ID " +
                "LEFT JOIN EMPLOYEE e2 ON e1.DEPARTMENT = e2.DEPARTMENT " +
                "AND e2.DOB > e1.DOB " +
                "GROUP BY e1.EMP_ID, e1.FIRST_NAME, e1.LAST_NAME, d.DEPARTMENT_NAME " +
                "ORDER BY e1.EMP_ID DESC;";

        System.out.println("\nFinal SQL Query:\n" + finalQuery);
    }
}