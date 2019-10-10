package com.hk.conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by HomKey on 2019/9/23.
 */
@Configuration
public class DcimDataConfig {

    @Bean(name = "dcimDataSource")
    @Qualifier("dcimDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.sqlserver")
    public DataSource dcimDataSource(){
        return DataSourceBuilder.create().build() ;
    }

    @Bean(name = "dcimJdbcTemplate")
    public JdbcTemplate dcimJdbcTemplate (
            @Qualifier("dcimDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
