package com.yang.mall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 14:46:01
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

