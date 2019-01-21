package com.ben.coloc.colocexpo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.ben.coloc")
public class ColocExpoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColocExpoApplication.class, args);
    }

}

