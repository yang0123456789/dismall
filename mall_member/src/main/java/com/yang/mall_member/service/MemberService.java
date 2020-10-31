package com.yang.mall_member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall_member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:03:24
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

