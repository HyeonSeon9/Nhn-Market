package com.nhnacademy.mart;

import java.util.ArrayList;

public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    public void add(Food food) {
        this.foods.add(food);
    }

    public Food buyFood(String name) {
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getName().equals(name)) {
                return foods.remove(i);
            }
        }
        return null;
    }
    // TODO 01 매대에 물건을 추가하는 메서드를 구현하세요

    // TODO 02 매대에 있는 특정 물건을 골라서 반환하는 메서드 구현하세요
}
