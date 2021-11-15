public class Student implements StudentInterface {

    private String name; // declare name
    private String id; // declare id

    Student() { // a default constructor
        name = "Unknown Name";
        id = "Unknown ID";
    }

    Student(String name, String id) { // a full constructor
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() { // overrides getName from interface
        return name; // return private name variable
    }

    @Override
    public String getID() { // overrides getID from interface
        return null;
    }

    @Override
    public String toString() { // overrides toString from interface
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
