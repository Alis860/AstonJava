package com.aston.java.lesson.task1;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        if (foodAmount >= 0) {
            this.foodAmount = foodAmount;
        } else System.out.println("Недостаточно еды в миске ");
           }
}
