package dk.zealand;

public class DishService {

    public Dish createDish(String name, int price) {
        validateName(name);
        validatePrice(price);
        return new Dish(name, price);
    }

    private void validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Dish name must not be null.");
        }
        if (name.length() > 50) {
            throw new IllegalArgumentException("Dish name must not exceed 50 characters.");
        }
    }

    private void validatePrice(int price) {
        if (price < 1 || price > 1000) {
            throw new IllegalArgumentException("Dish price must be between 1 and 1000 kr.");
        }
    }
}
