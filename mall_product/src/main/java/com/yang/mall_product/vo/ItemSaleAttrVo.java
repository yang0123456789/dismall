package com.yang.mall_product.vo;

import com.yang.mall_product.vo.AttrValueWithSkuIdVo;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class ItemSaleAttrVo{
	private Long attrId;

	private String attrName;

	private List<AttrValueWithSkuIdVo> attrValues;
}