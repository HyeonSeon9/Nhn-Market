package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    
    public void add(Item item){
        this.items.add(item);
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    // TODO 01 터미널에서 입력받은 구매 목록을 추가하는 메서드를 작성하세요

    // TODO 02 구매를 희망하는 물건들을 반환하는 메서드를 작성하세요

    // 구매를 희망하는 물건 이름과 갯수
    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return this.name;
        }

        public int getAmount() {
            return this.amount;
        }

    }

}
