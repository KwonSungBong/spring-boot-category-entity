package com.example.category.service;

import org.springframework.stereotype.Service;

/**
 * Created by ksb on 2017. 12. 19..
 */
@Service
public class FiveStrategyService extends StrategyService {

    @Override
    public int getNumber() {
        return 5;
    }

}
