package io.berkel.callback.config;

import io.berkel.callback.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSourceWorldDB(){

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/world?useSSL=false");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;

    }

    @Bean
    public DataSource dataSourceSakilaDB() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/sakila?useSSL=false");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;

    }

    @Bean
    public JdbcTemplate jdbcTemplateWorldDb() {
        return new JdbcTemplate(dataSourceWorldDB());
    }

    @Bean
    public JdbcTemplate jdbcTemplateSakilaDb() {
        return new JdbcTemplate(dataSourceSakilaDB());
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }

}
