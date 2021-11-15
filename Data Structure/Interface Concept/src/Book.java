/**
 *
 * Subject: Project Java
 *
 * Name: Ayham Al-Ali
 * Date: 13/01/2021
 * UID: 201910486
 *
 */

public class Book extends Goods implements Taxable {

    private String author;

    Book() {
        setDescription("Default Description");
        setPrice(0);
        setQuantity(0);
        this.author = "Ayham";
    }

    Book(String description, double price, int quantity, String author) {
        setDescription(description);
        setPrice(price);
        setQuantity(quantity);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", author=" + author +
                '}';
    }

    @Override
    public double getTotalPrice() {
        return getQuantity() * (getPrice() + calculateTax());
    }
}
