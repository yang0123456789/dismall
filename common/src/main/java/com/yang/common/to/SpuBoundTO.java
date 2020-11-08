package com.yang.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/8 12:30
 * # @version 1.0
 * # @File : SpuBoundTO.java
 * # @Software: IntelliJ IDEA
 *
 * Description：远程调用对象  成长积分、购物积分
 */
@Data
public class SpuBoundTO {
    private Long spuId;

    private BigDecimal buyBounds;

    private BigDecimal growBounds;
}
