package com.yang.mall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:10:05
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

