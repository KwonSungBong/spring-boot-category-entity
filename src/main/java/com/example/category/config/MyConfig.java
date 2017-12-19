package com.example.category.config;

import com.example.category.converter.MyConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by ksb on 2017. 12. 19..
 */
@Configuration
public class MyConfig extends WebMvcConfigurationSupport {

    @Override
    public FormattingConversionService mvcConversionService() {
        FormattingConversionService f = super.mvcConversionService();
        f.addConverter(new MyConverter());
        return f;
    }

}
