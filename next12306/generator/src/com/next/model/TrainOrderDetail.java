package com.next.model;

import java.util.Date;

public class TrainOrderDetail {
    private Long id;

    private String orderId;

    private String parentOrderId;

    private String ticket;

    private Long userId;

    private Long travellerId;

    private Integer trainNumberId;

    private Integer fromStationId;

    private Integer toStationId;

    private Integer carriageNumber;

    private Integer rowNumber;

    private Integer seatNumber;

    private Integer seatLevel;

    private Date trainStart;

    private Date trainEnd;

    private Integer money;

    private String showNumber;

    private Integer status;

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

    public String getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId == null ? null : parentOrderId.trim();
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

    public Long getTravellerId() {
        return travellerId;
    }

    public void setTravellerId(Long travellerId) {
        this.travellerId = travellerId;
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

    public Integer getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(Integer carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getSeatLevel() {
        return seatLevel;
    }

    public void setSeatLevel(Integer seatLevel) {
        this.seatLevel = seatLevel;
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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getShowNumber() {
        return showNumber;
    }

    public void setShowNumber(String showNumber) {
        this.showNumber = showNumber == null ? null : showNumber.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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