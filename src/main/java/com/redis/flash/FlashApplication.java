package com.redis.flash;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = {"com.redis.flash.demos.web.mapper"})
@EnableScheduling
public class FlashApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlashApplication.class, args);
    }

}
