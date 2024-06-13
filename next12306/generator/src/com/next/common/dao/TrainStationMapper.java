package com.next.common.dao;

import com.next.common.model.TrainStation;

public interface TrainStationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TrainStation record);

    int insertSelective(TrainStation record);

    TrainStation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainStation record);

    int updateByPrimaryKey(TrainStation record);
}