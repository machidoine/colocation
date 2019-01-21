package com.ben.coloc.colocinfrasql;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = "com.ben.coloc.colocinfrasql.entity")
@EnableJpaRepositories("com.ben.coloc.colocinfrasql")
public class JpaConfiguration {
}