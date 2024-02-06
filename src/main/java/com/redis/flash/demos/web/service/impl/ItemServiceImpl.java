package com.redis.flash.demos.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.redis.flash.demos.web.common.redis.template.RedisRepository;
import com.redis.flash.demos.web.entity.db.Item;
import com.redis.flash.demos.web.mapper.ItemMapper;
import com.redis.flash.demos.web.service.ItemService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService  {

    @Override
    public void liked() {
        Item.builder()
                .liked(2).build();
    }
}
