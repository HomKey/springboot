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
public class Cd2kSourceDataSourceConfig {

    @Bean(name = "cd2kSourceDataSource")
    @Qualifier("cd2kSourceDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.cd2k-source")
    public DataSource cd2kSourceDataSource(){
        return DataSourceBuilder.create().build() ;
    }

    @Bean(name = "cd2kSourceJdbcTemplate")
    public JdbcTemplate cd2kSourceJdbcTemplate (
            @Qualifier("cd2kSourceDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
