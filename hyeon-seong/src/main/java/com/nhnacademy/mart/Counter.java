package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // TODO 로그 출력을 이용해서 물건을 계산하는 과정을 출력해보세요.
    public void payBill(long amount,long bill){
        if(amount<bill) throw new IllegalArgumentException("잔액이 부족합니다.");
        long afterPay=amount-bill;
        logger.debug("총 가격은 "+bill+"원 입니다.\n"+"고객님 결제 후 잔액 : "+afterPay);

    }

    // TODO 01 바구니 안에 있는 물건들을 모두 확인하고 그 가격들의 합을 계산하여 반환하는 메서드를 작성하세요.
    public long bill(Basket basket){
        long sum=0;
        for(int i=0;i<basket.getBasket().size();i++){
            sum+=basket.getBasket().get(i).getPrice();
        }
        return sum;
    }
}
