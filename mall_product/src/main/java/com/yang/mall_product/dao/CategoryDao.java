package com.yang.mall_product.dao;

import com.yang.mall_product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 14:46:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
