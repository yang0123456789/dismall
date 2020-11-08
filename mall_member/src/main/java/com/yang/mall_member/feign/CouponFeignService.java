package com.yang.mall_member.feign;

import com.yang.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/1 10:05
 * # @version 1.0
 * # @File : CouponFeignService.java
 * # @Software: IntelliJ IDEA
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/list")
    public R list(@RequestParam Map<String, Object> params);
}
