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
public class MergeVo {
    /**
     * 整单id
     */
    private Long purchaseId;

    /**
     * [1,2,3,4]
     * 合并项集合
     */
    private List<Long> items;
}
