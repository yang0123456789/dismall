package com.yang.mall_product.vo;

import lombok.Data;

/**
 * <p>Title: AttrRespVo</p>
 * Description：
 *
 */
@Data
public class AttrRespVo extends AttrVo {

	private String catelogName;

	private String groupName;

	private Long[] catelogPath;
}
