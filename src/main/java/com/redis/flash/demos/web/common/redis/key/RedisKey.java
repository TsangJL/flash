package com.redis.flash.demos.web.common.redis.key;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
@Data
public class RedisKey implements Serializable {
    private static final long serialVersionUID = 1L;
    private KeyPrefixEnum keyPrefixEnum;
    private String key;

    public RedisKey(KeyPrefixEnum keyPrefixEnum, String key) {
        this.keyPrefixEnum = keyPrefixEnum;
        this.key = key;
    }
    public RedisKey(KeyPrefixEnum keyPrefixEnum, Long key) {
        this.keyPrefixEnum = keyPrefixEnum;
        this.key = key.toString();
    }


    public RedisKey(KeyPrefixEnum keyPrefixEnum) {
        this.keyPrefixEnum = keyPrefixEnum;
    }

    private String makeRedisKeyString() {
        String newKey = keyPrefixEnum.getKeyPrefix();
        if (StringUtils.isNotBlank(key)) {
            newKey = newKey + key;
        }
        if (newKey.equalsIgnoreCase("")) {
            return newKey;
        }
        newKey = new String(newKey.getBytes(), StandardCharsets.UTF_8);
        return newKey;
    }

    public String getRedisKey() {
        return makeRedisKeyString();
    }
}
