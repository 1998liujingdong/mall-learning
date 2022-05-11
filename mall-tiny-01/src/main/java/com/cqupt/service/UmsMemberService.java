package com.cqupt.service;

import com.cqupt.common.api.CommonResult;

/**
 * @author jingdong
 * @description: 会员管理Service
 * @menu
 * @date 2022/5/11 20:07
 */
public interface UmsMemberService {

    /**
     * 生成验证码，发送到手机
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号是否匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
