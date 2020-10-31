package com.yang.mall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:10:05
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

