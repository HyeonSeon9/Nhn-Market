package com.nhnacademy.mart;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
public class BasketTest {
    private Basket basket;
    private Food food1, food2, food3, food4;

    @Before
    public void setup() {
        basket = new Basket();
        food1 = new Food("계란", 5_000);
        food2 = new Food("양파", 1000);
        food3 = new Food("파", 500);
        food4 = new Food("사과", 2000);
        foods=new ArrayList<>();
    }

    @Test
    public void addBasketTest() {
        basket.add(food2);
        assertEquals(basket.getBasket().get(0).getName(), "양파");
    }

    @Test
    public void getBasketTest(){
        basket.add(food1);
        basket.add(food2);
        basket.add(food3);
        basket.add(food4);
        assertEquals(basket.getBasket().size(),4);
    }
}
