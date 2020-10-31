package com.yang.mall_order.dao;

import com.yang.mall_order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:10:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
