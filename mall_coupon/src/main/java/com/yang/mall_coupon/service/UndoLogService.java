package com.yang.mall_coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 22:29:19
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

