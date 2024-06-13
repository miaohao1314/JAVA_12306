package com.next.common.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Slf4j
public class TrainOrder {
    private Long id;

    private String orderId;

    private String ticket;

    private Long userId;

    private Integer trainNumberId;

    private Integer fromStationId;

    private Integer toStationId;

    private Date trainStart;

    private Date trainEnd;

    private Integer totalMoney;

    private Integer status;

    private Integer refundStatus;

    private Date createTime;

    private Date expireTime;

    private Date updateTime;


}