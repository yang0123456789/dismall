package com.yang.mall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_ware.entity.WareSkuEntity;
import com.yang.mall_ware.vo.WareSkuLockVo;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:16:42
 */
public interface WareSkuService extends IService<WareSkuEntity> {

//    void unlockStock(StockLockedTo to);

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存库存的时候顺便查到商品价格
     */
    double addStock(Long skuId, Long wareId, Integer skuNum);

    /**
     * 查询是否有库存
     */
//    List<SkuHasStockVo> getSkuHasStock(List<Long> skuIds);

    /**
     * 为某个订单锁定库存
     */
    Boolean orderLockStock(WareSkuLockVo vo);

    /**
     * 由于订单超时而自动释放订单之后来解锁库存
     */
//    void unlockStock(OrderTo to);
}

