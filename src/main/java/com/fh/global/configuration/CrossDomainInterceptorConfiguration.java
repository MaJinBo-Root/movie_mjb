package com.fh.global.configuration;

import com.fh.global.interceptor.CrossDomainInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrossDomainInterceptorConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration crossDomainInterceptor = registry.addInterceptor(new CrossDomainInterceptor());
        crossDomainInterceptor.addPathPatterns("/**");

    }
}
