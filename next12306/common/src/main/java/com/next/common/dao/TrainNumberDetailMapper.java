package com.next.common.dao;

import com.next.common.model.TrainNumberDetail;

public interface TrainNumberDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TrainNumberDetail record);

    int insertSelective(TrainNumberDetail record);

    TrainNumberDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TrainNumberDetail record);

    int updateByPrimaryKey(TrainNumberDetail record);
}