package com.example.category.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by ksb on 2017. 12. 19..
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum StrategyType {
    ONE("one", "oneStrategyService"),
    TWO("two", "twoStrategyService"),
    THREE("three", "threeStrategyService"),
    FOUR("four", "fourStrategyService"),
    FIVE("five", "fiveStrategyService");

    private String value;
    private String serviceBeanName;

    public static StrategyType value(String value) {
        switch (value){
            case "one" : return ONE;
            case "two" : return TWO;
            case "three" : return THREE;
            case "four" : return FOUR;
            case "five" : return FIVE;
            default: return ONE;
        }
    }

}
