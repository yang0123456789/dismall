package com.yang.mall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 14:46:00
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

