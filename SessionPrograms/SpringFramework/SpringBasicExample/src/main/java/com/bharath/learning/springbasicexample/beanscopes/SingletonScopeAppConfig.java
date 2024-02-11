package com.bharath.learning.springbasicexample.beanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SingletonScopeAppConfig {

    @Bean
    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }
}
