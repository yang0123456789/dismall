package com.yang.mall_product.vo;

import com.yang.mall_product.vo.SpuBaseAttrVo;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class SpuItemAttrGroup{
	private String groupName;

	private List<SpuBaseAttrVo> attrs;
}