package org.example;

import org.example.model.Apple;
import org.example.model.Food;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);

        ShoppingCart cart = new ShoppingCart(new Food[]{meat, redApple, greenApple});

        System.out.printf("Total price with discount: %.0f%n", cart.getTotalPriceWithDiscount());
        System.out.printf("Total price without discount: %.0f%n", cart.getTotalPriceWithoutDiscount());
        System.out.printf("Total Vegetarian price without discount: %.0f%n", cart.getVegetarianTotalPriceWithoutDiscount());

    }
}
