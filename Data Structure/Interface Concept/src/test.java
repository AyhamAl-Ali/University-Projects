/**
 *
 * Subject: Project Java
 *
 * Name: Ayham Al-Ali
 * Date: 13/01/2021
 * UID: 201910486
 *
 */

public class test {

    public static void main(String[] args) {

        // Create an object of three types
        Toy toy = new Toy("Lego", 5, 20, 5);
        Food food = new Food("Labana", 1.6, 1, 3);
        Book book = new Book("OOP", 30, 15, "Detiel");

        // Print the information of these objects.
        println(toy.toString());
        println(food.toString());
        println(book.toString());

        // Print description of toy object, tax value and total price
        println("\nDescription of Toy: " + toy.getDescription());
        println("Tax of Toy: " + toy.calculateTax());
        println("Total Price of Toy: " + toy.getTotalPrice() + " JD\n");

        // Change desc of book from "OOP" to "Data Structures"
        book.setDescription("Data Structures");

        // Print new information after changing.
        println(book);

        // Print description of book object, tax value and total price.
        println("\nDescription of Book: " + book.getDescription());
        println("Tax of Book: " + book.calculateTax());
        println("Total Price of Book: " + book.getTotalPrice() + " JD\n");

        // Note: in the question this step is not mentioned but in the example screenshot there is
        food.setQuantity(4);
        // Note: in the question this step is not mentioned but in the example screenshot there is
        println(food);

        // Print description of food object and total price.
        println("\nDescription of Food: " + food.getDescription());
        println("Total Price of Food: " + food.getTotalPrice() + " JD");

    }

    public static void println(Object s) {
        System.out.println(s);
    }
    public static void print(Object s) {
        System.out.print(s);
    }

}


