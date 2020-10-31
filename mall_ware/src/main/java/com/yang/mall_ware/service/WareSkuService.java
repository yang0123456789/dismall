package com.yang.mall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:16:42
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

