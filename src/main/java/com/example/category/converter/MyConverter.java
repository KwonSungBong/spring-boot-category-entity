package com.example.category.converter;

import com.example.category.dto.StrategyType;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by ksb on 2017. 12. 19..
 */
public class MyConverter implements Converter<String, StrategyType> {

    public StrategyType convert(String value) {
        return StrategyType.value(value);
    }

}