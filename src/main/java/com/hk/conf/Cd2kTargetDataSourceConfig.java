package com.hk.conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by HomKey on 2019/9/23.
 */
@Configuration
public class Cd2kTargetDataSourceConfig {

    @Bean(name = "cd2kTargetDataSource")
    @Qualifier("cd2kTargetDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.cd2k-target")
    public DataSource cd2kTargetDataSource(){
        return DataSourceBuilder.create().build() ;
    }

    @Bean(name = "cd2kTargetJdbcTemplate")
    public JdbcTemplate cd2kTargetJdbcTemplate (
            @Qualifier("cd2kTargetDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
