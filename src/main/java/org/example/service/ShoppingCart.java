package org.example.service;

import org.example.model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods =  foods;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;

        for (Food food : foods) {
            total +=  food.getPrice() * food.getAmount() - (food.getPrice() * food.getAmount() * food.getDiscount()) / 100;
        }
        return total;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;

        for (Food food : foods) {
            total += food.getPrice() * food.getAmount();
        }

        return total;
    }

    public double getVegetarianTotalPriceWithoutDiscount() {
        double total = 0;

        for (Food food : foods) {
            if (food.isVegetarian()) {
                total += food.getPrice() * food.getAmount();
            }
        }

        return total;
    }
}
