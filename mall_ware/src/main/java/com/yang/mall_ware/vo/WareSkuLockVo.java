package com.yang.mall_ware.vo;

import lombok.Data;

import java.util.List;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/8 16:29
 * # @version 1.0
 * # @File : MergeVo.java
 * # @Software: IntelliJ IDEA
 */
@Data
public class WareSkuLockVo {

	/**
	 * 订单号
	 */
	private String orderSn;

	/**
	 * 要锁住的所有库存信息
	 */
	private List<OrderItemVo> locks;

}
