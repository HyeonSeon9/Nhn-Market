package com.nhnacademy.mart;

import java.util.Objects;
import com.nhnacademy.mart.BuyList.Item;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    // 고객이 소유한 금액
    private long amount;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
        this.amount=20000;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    public void pickFoods(FoodStand foodStand) {
        for (int i = 0; i < this.buyList.getItems().size(); i++) {
            Item item = buyList.getItems().get(i);
            for (int j = 0; j < item.getAmount(); j++) {
                Food food = foodStand.buyFood(item.getName());
                if(Objects.isNull(food)) throw new IllegalArgumentException("마트에 재고가 부족합니다.");
                this.basket.add(food);
            }
        }
    }

    public void payTox(Counter counter) {
        counter.payBill(amount, counter.bill(this.basket));
    }

    // TODO 01 구매 목록을 토대로 매대의 물건을 장바구니에 담는 메서드를 작성하세요.

    // TODO 02 장바구니 안에 있는 물건들의 가격을 계산하기 위해 장바구니를 넘기고 값을 치루는 메서드를 작성하세요.

}
