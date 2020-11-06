package com.yang.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/5 11:48
 * # @version 1.0
 * # @File : CorssConfiguration.java
 * # @Software: IntelliJ IDEA
 */
@Configuration
public class mallCorsConfiguration {
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 配置跨越允许任意请求头
        corsConfiguration.addAllowedHeader("*");
        // 允许任意方法
        corsConfiguration.addAllowedMethod("*");
        // 允许任意请求来源
        corsConfiguration.addAllowedOrigin("*");
        // 允许携带cookie
        corsConfiguration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(source);
    }
}
