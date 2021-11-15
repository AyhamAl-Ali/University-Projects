/**
 *
 * Subject: Project Java
 *
 * Name: Ayham Al-Ali
 * Date: 13/01/2021
 * UID: 201910486
 *
 */

public abstract class Goods {

    private String description;
    private double price;
    private int quantity;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double getTotalPrice();

    @Override
    public String toString() {
        return "Goods{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
