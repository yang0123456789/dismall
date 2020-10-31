package com.yang.mall_member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:03:23
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

