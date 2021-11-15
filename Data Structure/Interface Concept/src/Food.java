/**
 *
 * Subject: Project Java
 *
 * Name: Ayham Al-Ali
 * Date: 13/01/2021
 * UID: 201910486
 *
 */

public class Food extends Goods {

    private double calories;

    Food() {
        setDescription("Default Description");
        setPrice(0);
        setQuantity(0);
        this.calories = 0;
    }

    Food(String description, double price, int quantity, double calories) {
        setDescription(description);
        setPrice(price);
        setQuantity(quantity);
        this.calories = calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public double getTotalPrice() {
        return getQuantity() * getPrice();
    }

    @Override
    public String toString() {
        return "Food{" +
                "description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", calories=" + calories +
                '}';
    }
}
