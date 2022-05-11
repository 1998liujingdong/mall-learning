package com.cqupt.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingdong
 * @description: MybatisPlus配置类
 * @menu
 * @date 2022/5/11 17:05
 */
@Configuration
@MapperScan("com.cqupt.mbg.mapper")
public class MybatisConfig {
}
