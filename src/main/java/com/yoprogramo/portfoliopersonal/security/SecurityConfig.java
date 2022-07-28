package com.yoprogramo.portfoliopersonal.security;

import java.util.Arrays;
import javax.persistence.criteria.Order;
import org.hibernate.internal.CriteriaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.cors().and()
                //.httpBasic().and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .csrf().disable();

    }

    @Bean
    public FilterRegistrationBean<JWTAuthFilter> jwtAuthFilter() {
        FilterRegistrationBean<JWTAuthFilter> filterRegBean = new FilterRegistrationBean<>();
        filterRegBean.setFilter(new JWTAuthFilter());
        filterRegBean.addUrlPatterns("/crear/*", "/borrar/*");
        filterRegBean.setOrder(Ordered.LOWEST_PRECEDENCE - 1);
        return filterRegBean;
    }

}
