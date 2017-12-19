package com.example.category.controller;

import com.example.category.dto.StrategyType;
import com.example.category.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by ksb on 2017. 12. 19..
 */
@RestController
@RequestMapping("/strategy")
public class StrategyController {

    @Autowired
    private Map<String, StrategyService> strategyService;

    @RequestMapping(method = RequestMethod.GET, value="/type/{strategyType}")
    public int get(@PathVariable("strategyType") StrategyType strategyType){
        return strategyService.get(strategyType.getServiceBeanName()).getNumber();
    }

}
