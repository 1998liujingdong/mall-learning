package com.cqupt.service;

import com.cqupt.common.api.CommonPage;
import com.cqupt.common.api.CommonResult;
import com.cqupt.dto.ConfirmOrderResult;
import com.cqupt.dto.OmsOrderDetail;
import com.cqupt.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 前台订单管理Service
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

}
