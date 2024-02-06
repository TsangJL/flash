package com.redis.flash.demos.web.common.redis.prefix;

import com.redis.flash.demos.web.common.redis.key.KeyPrefixEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RedisLockKeyPrefixEnum implements KeyPrefixEnum {
    COMMON_REDIS_LOCK_KET("common:lock:", "redis 分布式锁 应用模块 通用 redis lock 前缀");


    private final String keyPrefix;

    private final String keyInfo;
}
