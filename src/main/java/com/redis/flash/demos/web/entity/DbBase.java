package com.redis.flash.demos.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@Accessors(chain = true)
public class DbBase implements Serializable {
    private static final long serialVersionUID = 389123410545489578L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    public void a(){
        System.out.println("12111");
    }

    public void b(){
        System.out.println("11111");
    }

}
