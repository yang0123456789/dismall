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
public class PurchaseItemDoneVo {
	/**
	 * "itemId":1,"status":3,"reason":"",
	 * "itemId":3,"status":4,"reason":"无货"
	 */
	private Long itemId;

    private Integer status;

    private String reason;
}
