/**
 *
 * Subject: Project Java
 *
 * Name: Ayham Al-Ali
 * Date: 13/01/2021
 * UID: 201910486
 *
 */

public class Toy extends Goods implements Taxable {


    private int minimumAge;

    Toy() {
        setDescription("Default Description");
        setPrice(0);
        setQuantity(0);
        this.minimumAge = 0;
    }

    Toy(String description, double price, int quantity, int minimumAge) {
        setDescription(description);
        setPrice(price);
        setQuantity(quantity);
        this.minimumAge = minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", minimumAge=" + minimumAge +
                '}';
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public double getTotalPrice() {
        return getQuantity() * (getPrice() + calculateTax());
    }



}
