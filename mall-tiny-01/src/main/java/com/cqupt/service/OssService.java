package com.cqupt.service;

import com.cqupt.dto.OssCallbackResult;
import com.cqupt.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jingdong
 * @description: Oss上传管理Service
 * @menu
 * @date 2022/5/24 21:37
 */
public interface OssService {

    /**
     * oss上传策略生成
     * @return
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     * @param request
     * @return
     */
    OssCallbackResult callback(HttpServletRequest request);
}
