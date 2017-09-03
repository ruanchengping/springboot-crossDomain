package com.viewhigh.vadp.print.spring.start;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebApplicationConfig extends WebMvcConfigurerAdapter {
    @Bean
    public FilterRegistrationBean accessControlFilterRegistrationBean() {

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        AccessControlFilter accessControlFilter=new AccessControlFilter();
        registrationBean.setFilter(accessControlFilter);
        return registrationBean;
    }
}