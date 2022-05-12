package com.cqupt.service;

import com.cqupt.mbg.model.UmsAdmin;
import com.cqupt.mbg.model.UmsPermission;

import java.util.List;

/**
 * @author jingdong
 * @description: 后台管理员Service
 * @menu
 * @date 2022/5/11 22:17
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}