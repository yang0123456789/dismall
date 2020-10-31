package com.yang.mall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 14:46:01
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

