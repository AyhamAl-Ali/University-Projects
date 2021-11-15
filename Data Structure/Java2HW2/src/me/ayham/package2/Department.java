package me.ayham.package2;

//import me.ayham.package1.Company;

/*
  removed "extends" because if i use it i can't create instances of Department in Company,
  that will make an infinite loop because the constructor of Department calls super()
  which is Company's constructor and Company's constructor creates Department instance
  and that will never stop and causes infinite loop
 */
public class Department { //extends Company // Note: read above

    private String name;
    private int noEmployees;

    public Department() {
        this.name = "Unknown";
        this.noEmployees = 0;
    }

    public Department(String name, int noEmployees) {
        this.name = name;
        this.noEmployees = noEmployees;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNoEmployees(int noEmployees) {
        this.noEmployees = noEmployees;
    }
    public int getNoEmployees() {
        return noEmployees;
    }

    public void print() {
        System.out.println("Dep Name: " + name);
        System.out.println("Dep Number of Employees: " + noEmployees);
    }



}
