package com.yang.mall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:16:42
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

