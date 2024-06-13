
-- 对应课程里面的数据库名为： t_train_order

DROP TABLE IF EXISTS `train_order`;
CREATE TABLE `train_order` (
  `id` bigint(21) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '订单号',
  `ticket` varchar(60) COLLATE utf8mb4_bin NOT NULL COMMENT '车票号',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '登录用户',
  `train_number_id` int(11) NOT NULL DEFAULT '0' COMMENT '车次',
  `from_station_id` int(11) NOT NULL DEFAULT '0' COMMENT '出发站点',
  `to_station_id` int(11) NOT NULL DEFAULT '0' COMMENT '到达站点',
  `train_start` TIMESTAMP NOT NULL COMMENT '发车时间',
  `train_end` TIMESTAMP NOT NULL COMMENT '到达时间',
  `total_money` int(11) NOT NULL DEFAULT '0' COMMENT '价格',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '支付状态，10：已占票等待支付，20：已支付，30：超时未支付自动取消，40：支付后退款',
  `refund_status` int(11) NOT NULL DEFAULT '0' COMMENT '退款状态，10：提交退款，20：退款审核成功，30：退款中，40：退款成功, 50:退款失败',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `expire_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最晚支付时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_orderid` (`order_id`) USING BTREE,
  KEY `idx_trainnumberid_ticket` (`train_number_id`,`ticket`) USING BTREE,
  KEY `idx_userid` (`user_id`) USING BTREE,
  KEY `idx_expiretime` (`expire_time`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


DROP TABLE IF EXISTS `train_order_detail`;
CREATE TABLE `train_order_detail` (
  `id` bigint(21) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '订单号',
  `parent_order_id` varchar(40) COLLATE utf8mb4_bin NOT NULL COMMENT '主订单号',
  `ticket` varchar(60) COLLATE utf8mb4_bin NOT NULL COMMENT '车票号',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '登录用户',
  `traveller_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '绑定的乘客',
  `train_number_id` int(11) NOT NULL DEFAULT '0' COMMENT '车次',
  `from_station_id` int(11) NOT NULL DEFAULT '0' COMMENT '出发站点',
  `to_station_id` int(11) NOT NULL DEFAULT '0' COMMENT '到达站点',
  `carriage_number` int(11) NOT NULL COMMENT '车厢',
  `row_number` int(11) NOT NULL DEFAULT '0' COMMENT '排',
  `seat_number` int(11) NOT NULL DEFAULT '0' COMMENT 'A~F',
  `seat_level` int(11) NOT NULL DEFAULT '2' COMMENT '座位等级，0：特等座，1：一等座，2：二等座，3：无座',
  `train_start` TIMESTAMP NOT NULL COMMENT '发车时间',
  `train_end` TIMESTAMP NOT NULL COMMENT '到达时间',
  `money` int(11) NOT NULL DEFAULT '0' COMMENT '价格',
  `show_number` varchar(20) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '展示',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态，10：已占票等待支付，20：已支付，30：超时未支付自动取消',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `expire_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最晚支付时间',
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_orderid` (`order_id`) USING BTREE,
  KEY `idx_parentorderid` (`parent_order_id`) USING BTREE,
  KEY `idx_userid` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
