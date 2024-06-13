package com.next.orderDao;

import com.next.model.TrainOrderDetail;

public interface TrainOrderDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TrainOrderDetail record);

    int insertSelective(TrainOrderDetail record);

    TrainOrderDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrainOrderDetail record);

    int updateByPrimaryKey(TrainOrderDetail record);
}