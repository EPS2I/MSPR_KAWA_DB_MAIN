package com.mspr_kawa.db.main.fakerdata;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakerDataConfig {

    @Bean
    public Faker faker() {
        return new Faker();
    }
}
