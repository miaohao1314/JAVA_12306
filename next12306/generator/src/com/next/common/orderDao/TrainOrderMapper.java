package com.next.common.orderDao;

import com.next.common.model.TrainOrder;

public interface TrainOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainOrder record);

    int insertSelective(TrainOrder record);

    TrainOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainOrder record);

    int updateByPrimaryKey(TrainOrder record);
}