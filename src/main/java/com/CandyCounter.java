package com;

public class CandyCounter {

    public int CountCandy(int money, int price, int k){
        if (price != 0){
            int qCandyByMoney = money / price;
            if (k == 0) throw new ArithmeticException();
            int qCandyByWrapper = qCandyByMoney / k;
            return qCandyByMoney + qCandyByWrapper;
        } else return 0;
    }
}
