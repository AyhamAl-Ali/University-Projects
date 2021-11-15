package me.ayham.package3;

import me.ayham.package1.Company;

public class TestCompany {

    public static void main(String[] args) {

        // Print number of company objects
        println(">> Number of company objects: " + Company.getCompanyNumber());

        // Create an object of type Company (use full param constructor)
        Company comp = new Company("DesignsField Agency", "Amman", "dep1", 2);

        // Print the information of this object
        comp.printInfo();

        // Change the name of the Department of this company.
        comp.dep.setName("department1");

        // Print the information after updating.
        comp.printInfo();

        // Print if the company is in Amman or not.
        println("Is in capital (Amman): " + comp.isInCapital());

        // Print the number of Company objects.
        println(">> Number of company objects: " + Company.getCompanyNumber());


    }


    public static void println(String s) {
        System.out.println(s);
    }
    public static void print(String s) {
        System.out.print(s);
    }

}
