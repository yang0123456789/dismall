package com.yang.mall_ware.vo;

import lombok.Data;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/8 16:29
 * # @version 1.0
 * # @File : MergeVo.java
 * # @Software: IntelliJ IDEA
 */
@Data
public class LockStockResult {
	private Long skuId;

	private Integer num;

	private Boolean locked;

}
