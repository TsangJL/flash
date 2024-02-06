//package com.redis.flash.demos.web.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ConditionalOnProperty(name="spring.redis.host")
//public class RedissonConfig {
//
//    @Value("${spring.redis.host}")
//    private String redisHost;
//
//    @Value("${spring.redis.port}")
//    private String redisPort;
//
//    @Value("${spring.redis.password}")
//    private String redisPassword;
//
//    @Bean
//    public RedissonClient redissonClient() {
//        Config config = new Config();
//        SingleServerConfig singleServerConfig = config.useSingleServer();
//        singleServerConfig.setAddress(String.format("redis://%s:%s", redisHost, redisPort));
//        singleServerConfig.setPassword(redisPassword);
//        RedissonClient redisson = Redisson.create(config);
//        return redisson;
//    }
//}
