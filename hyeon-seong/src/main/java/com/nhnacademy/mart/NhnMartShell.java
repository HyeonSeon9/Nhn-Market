package com.nhnacademy.mart;

import java.util.Scanner;
import com.nhnacademy.mart.BuyList.Item;

public class NhnMartShell {
    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();
        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요. (ex: 양파 2 계란 2 파 4)");

        BuyList buyList = inputBuyListFromShell();


        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer hyeonSeong = new Customer(buyList);

        // 장바구니를 챙긴다.
        hyeonSeong.bring(mart.provideBasket());

        // 식품을 담는다.
        hyeonSeong.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        hyeonSeong.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        BuyList buyList = new BuyList();

        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] buyThis = s.split(" ");
        try {
            for (int i = 0; i < buyThis.length; i++) {
                String name = buyThis[i++];
                int amout = Integer.parseInt(buyThis[i]);
                if (name.equals("양파")) {
                    buyList.add(new Item(name, amout));
                } else if (name.equals("파")) {
                    buyList.add(new Item(name, amout));
                } else if (name.equals("계란")) {
                    buyList.add(new Item(name, amout));
                } else if (name.equals("사과")) {
                    buyList.add(new Item(name, amout));
                } else {
                    throw new IllegalArgumentException("존재하지 않는 상품입니다.");
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("입력을 정확하게 해주세요");
        }


        return buyList;
    }
}
