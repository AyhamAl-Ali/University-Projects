package me.ayham.package1;

import me.ayham.package2.Department;

public class Company {

    private String name;
    private String city;
    public Department dep = new Department(); // infinite loop if Department extends from Company
    private static int countCompany;

    public Company() {
        this("Unknown Name", "Unknown City");
    }

    public Company(String name, String city) {
        this.name = name;
        this.city = city;
        dep = new Department();
        dep.setName("Unknown Department");
        dep.setNoEmployees(0);
        countCompany++;

    }

    public Company(String name, String city, String depName, int depNoEmployees) {
        this.name = name;
        this.city = city;
        dep.setName(depName);
        dep.setNoEmployees(depNoEmployees);
        dep = new Department(depName, depNoEmployees);
        countCompany++;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        dep.print();
        System.out.println('\n');

    }

    public boolean isInCapital() {
        return city.equals("Amman");
    }

    public static int getCompanyNumber() {
        return countCompany;
    }



}
