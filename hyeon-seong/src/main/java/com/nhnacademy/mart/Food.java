package com.nhnacademy.mart;

public class Food {

    private String name;
    private int price;

    public Food(String name,int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
    
    public String getName(){
        return this.name;
    }
    //TODO 01 이름과 가격 필드에 값을 넣을 수 있는 메서드 혹은 생성자를 작성하세요.

    //TODO 02 Food의 각 필드에 값을 반환하는 메서드를 작성하세요.
}
