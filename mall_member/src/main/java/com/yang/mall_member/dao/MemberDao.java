package com.yang.mall_member.dao;

import com.yang.mall_member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yq
 * @email 378525908@qq.com
 * @date 2020-10-31 23:03:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
