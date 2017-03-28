package com.brankodjurasevic.configuration;

/**
 * Created by branko.djurasevic on 3/24/2017.
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.brankodjurasevic.domain"})
@EnableJpaRepositories(basePackages = {"com.brankodjurasevic.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
