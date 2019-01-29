package com.pengtg.strategymode;
//出租车计算策略
public class TaxiStrategy implements CalculateStrategy {
    //价格我们简单计算为公里数 * 2
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
