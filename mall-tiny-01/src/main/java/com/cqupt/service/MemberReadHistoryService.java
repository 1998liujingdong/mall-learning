package com.cqupt.service;

import com.cqupt.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * 会员浏览记录管理Service
 */
public interface MemberReadHistoryService {

    /**
     * 生成浏览记录
     * @param memberReadHistory
     * @return
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     * @param ids
     * @return
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史
     * @param memberId
     * @return
     */
    List<MemberReadHistory> list(Long memberId);
}
