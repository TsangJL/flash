package com.redis.flash.demos.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.redis.flash.demos.web.entity.db.Item;

public interface ItemService extends IService<Item> {
    void liked();
}
