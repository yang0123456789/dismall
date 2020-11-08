package com.yang.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/8 12:32
 * # @version 1.0
 * # @File : MemberPrice.java
 * # @Software: IntelliJ IDEA
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;
}
