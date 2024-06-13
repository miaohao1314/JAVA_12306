package com.next.model;

public class TrainNumberDetail {
    private Integer id;

    private Integer trainNumberId;

    private Integer fromStationId;

    private Integer fromCityId;

    private Integer toStationId;

    private Integer toCityId;

    private Integer stationIndex;

    private Integer relativeMinute;

    private Integer waitMinute;

    private String money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getFromCityId() {
        return fromCityId;
    }

    public void setFromCityId(Integer fromCityId) {
        this.fromCityId = fromCityId;
    }

    public Integer getToStationId() {
        return toStationId;
    }

    public void setToStationId(Integer toStationId) {
        this.toStationId = toStationId;
    }

    public Integer getToCityId() {
        return toCityId;
    }

    public void setToCityId(Integer toCityId) {
        this.toCityId = toCityId;
    }

    public Integer getStationIndex() {
        return stationIndex;
    }

    public void setStationIndex(Integer stationIndex) {
        this.stationIndex = stationIndex;
    }

    public Integer getRelativeMinute() {
        return relativeMinute;
    }

    public void setRelativeMinute(Integer relativeMinute) {
        this.relativeMinute = relativeMinute;
    }

    public Integer getWaitMinute() {
        return waitMinute;
    }

    public void setWaitMinute(Integer waitMinute) {
        this.waitMinute = waitMinute;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }
}