#item

CREATE TABLE `item` (
`id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
`liked` tinyint(1) DEFAULT '0',
`deleted` tinyint(1) DEFAULT '0',
`create_time` datetime DEFAULT CURRENT_TIMESTAMP,
`update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='item';