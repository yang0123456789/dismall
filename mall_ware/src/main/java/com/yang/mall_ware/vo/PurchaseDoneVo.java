package com.yang.mall_ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;
/**
 * # @author  chilcyWind
 * # @Time   2020/11/8 16:29
 * # @version 1.0
 * # @File : MergeVo.java
 * # @Software: IntelliJ IDEA
 */
@Data
public class PurchaseDoneVo {

	/**
	 * 采购单id
	 */
    @NotNull
    private Long id;

    private List<PurchaseItemDoneVo> items;
}
