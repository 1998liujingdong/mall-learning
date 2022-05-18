package com.cqupt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author jingdong
 * @description:
 * @menu
 * @date 2022/5/18 20:30
 */
@Configuration
public class GlobalCorsConfig {

    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        /**
         * 允许所有域名进行跨域调用
         */
        corsConfiguration.addAllowedOrigin("");
        /**
         * 允许跨域发送cookie
         */
        corsConfiguration.setAllowCredentials(true);
        /**
         * 放行全部原始头信息
         */
        corsConfiguration.addAllowedHeader("*");
        /**
         * 允许所有请求方法跨域调用
         */
        corsConfiguration.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }
}
