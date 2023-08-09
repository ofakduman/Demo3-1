package com.example.demo3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.demo3.repository")
@EntityScan(basePackages = "com.example.demo3.model")
public class DatabaseConfig {

    // Herhangi bir özel yapılandırma gerekiyorsa burada yapabilirsiniz.

}
