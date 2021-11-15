public class Main {


    public static void main(String[] args) {

        // Create 4 Students with their full name and ID
        Student s1 = new Student("Ayham Al-Ali", "201910486");
        Student s2 = new Student("Ali Al-Ali", "201910487");
        Student s3 = new Student("Hameed Al-Ali", "201910488");
        Student s4 = new Student("Ayham Ali", "201910489");

        // Print students (no need for toString since it uses it by default when printing classes)
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }

}
