package com.next.model;

import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getTrainNumberId() {
        return trainNumberId;
    }

    public void setTrainNumberId(Integer trainNumberId) {
        this.trainNumberId = trainNumberId;
    }

    public Integer getFromStationId() {
        return fromStationId;
    }

    public void setFromStationId(Integer fromStationId) {
        this.fromStationId = fromStationId;
    }

    public Integer getToStationId() {
        return toStationId;
    }

    public void setToStationId(Integer toStationId) {
        this.toStationId = toStationId;
    }

    public Date getTrainStart() {
        return trainStart;
    }

    public void setTrainStart(Date trainStart) {
        this.trainStart = trainStart;
    }

    public Date getTrainEnd() {
        return trainEnd;
    }

    public void setTrainEnd(Date trainEnd) {
        this.trainEnd = trainEnd;
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}