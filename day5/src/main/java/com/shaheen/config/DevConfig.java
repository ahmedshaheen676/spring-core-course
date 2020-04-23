package com.shaheen.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.shaheen")
@PropertySource("classpath:config-development.properties")
@Profile("development")
public class DevConfig {
    @Value("${jdbc.url}")
    private String dbUrl;

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.user}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource(dbUrl, driver, username, password);
        return dataSource;
    }
}
