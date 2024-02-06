package com.redis.flash;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
class FlashApplicationTests {
    @Resource
    private DataSource dataSource;
    @Resource
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        redisTemplate.opsForSet().add("1:1",1);
        redisTemplate.opsForSet().add("1:2",1);
        redisTemplate.opsForSet().add("1:3",1);
    }

}
