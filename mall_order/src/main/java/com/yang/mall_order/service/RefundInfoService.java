package com.yang.mall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:10:04
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

