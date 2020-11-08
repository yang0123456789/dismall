package com.yang.mall_product.vo;

import lombok.Data;

import java.math.BigDecimal;
/**
 * <p>Title: AttrRespVo</p>
 * Description：会员价格
 * date：
 */
@Data
public class MemberPrice {

    private Long id;

    private String name;

    private BigDecimal price;
}