package com.pengtg.strategymode;

public class TransitCalculator {
    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.mStrategy = strategy;
    }

    public int calculatePrice(int km){
        return mStrategy.calculatePrice(km);
    }
}
