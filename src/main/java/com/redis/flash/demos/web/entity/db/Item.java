package com.redis.flash.demos.web.entity.db;

import com.redis.flash.demos.web.entity.DbBase;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Item extends DbBase {
    private Integer liked;

    private Integer deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
