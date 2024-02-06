package com.redis.flash.demos.web.common.redis.prefix;

import com.redis.flash.demos.web.common.redis.key.KeyPrefixEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AppPrefixEnum implements KeyPrefixEnum {
    TEST_KET("test:key", "test");


    private final String keyPrefix;

    private final String keyInfo;
}
