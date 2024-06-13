
-- 对应课程里面的数据库名为： t_train_seat_5

DROP TABLE IF EXISTS `train_seat_5`;
CREATE TABLE `train_seat_5` (
  `id` bigint(21) NOT NULL AUTO_INCREMENT,
  `ticket` varchar(60) COLLATE utf8mb4_bin NOT NULL COMMENT '订单号',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '登录用户id',
  `traveller_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '绑定的乘客id',
  `train_number_id` int(11) NOT NULL DEFAULT '0' COMMENT '车次',
  `carriage_number` int(11) NOT NULL COMMENT '车厢',
  `row_number` int(11) NOT NULL DEFAULT '0' COMMENT '排',
  `seat_number` int(11) NOT NULL DEFAULT '0' COMMENT 'A~F',
  `seat_level` int(11) NOT NULL DEFAULT '2' COMMENT '座位等级，0：特等座，1：一等座，2：二等座，3：无座',
  `train_start` datetime NOT NULL COMMENT '发车时间',
  `train_end` datetime NOT NULL COMMENT '到达时间',
  `money` int(11) NOT NULL DEFAULT '0' COMMENT '价格',
  `show_number` varchar(20) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '展示',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态，0:初始，1：已放票，2：占有票等待支付，3：已支付，4：不外放',
  `from_station_id` int(11) NOT NULL DEFAULT '0',
  `to_station_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `idx_trainnumberid_ticket` (`train_number_id`,`ticket`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

DROP TABLE IF EXISTS `train_seat_10`;
CREATE TABLE `train_seat_10` (
  `id` bigint(21) NOT NULL AUTO_INCREMENT,
  `ticket` varchar(60) COLLATE utf8mb4_bin NOT NULL COMMENT '订单号',
  `user_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '登录用户id',
  `traveller_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '绑定的乘客id',
  `train_number_id` int(11) NOT NULL DEFAULT '0' COMMENT '车次',
  `carriage_number` int(11) NOT NULL COMMENT '车厢',
  `row_number` int(11) NOT NULL DEFAULT '0' COMMENT '排',
  `seat_number` int(11) NOT NULL DEFAULT '0' COMMENT 'A~F',
  `seat_level` int(11) NOT NULL DEFAULT '2' COMMENT '座位等级，0：特等座，1：一等座，2：二等座，3：无座',
  `train_start` datetime NOT NULL COMMENT '发车时间',
  `train_end` datetime NOT NULL COMMENT '到达时间',
  `money` int(11) NOT NULL DEFAULT '0' COMMENT '价格',
  `show_number` varchar(20) COLLATE utf8mb4_bin NOT NULL DEFAULT '' COMMENT '展示',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态，0:初始，1：已放票，2：占有票等待支付，3：已支付，4：不外放',
  `from_station_id` int(11) NOT NULL DEFAULT '0',
  `to_station_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;