package com.next.orderDao;

import com.next.model.TrainOrder;

public interface TrainOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainOrder record);

    int insertSelective(TrainOrder record);

    TrainOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainOrder record);

    int updateByPrimaryKey(TrainOrder record);
}