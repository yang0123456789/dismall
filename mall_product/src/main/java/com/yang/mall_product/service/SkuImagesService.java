package com.yang.mall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 14:46:00
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

