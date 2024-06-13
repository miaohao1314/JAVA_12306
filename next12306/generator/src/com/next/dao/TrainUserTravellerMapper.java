package com.next.dao;

import com.next.model.TrainUserTraveller;

public interface TrainUserTravellerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainUserTraveller record);

    int insertSelective(TrainUserTraveller record);

    TrainUserTraveller selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainUserTraveller record);

    int updateByPrimaryKey(TrainUserTraveller record);
}