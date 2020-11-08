package com.yang.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/8 12:31
 * # @version 1.0
 * # @File : SkuReductionTO.java
 * # @Software: IntelliJ IDEA
 */
@Data
public class SkuReductionTO {

    private Long skuId;

    /***
     * fullCount、discount、countStatus  打折信息
     */
    private int fullCount;

    private BigDecimal discount;

    private int countStatus;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;

    private int priceStatus;

    private List<MemberPrice> memberPrice;
}