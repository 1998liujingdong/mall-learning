package com.cqupt.dto;

import com.cqupt.mbg.model.UmsIntegrationConsumeSetting;
import com.cqupt.mbg.model.UmsMemberReceiveAddress;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author jingdong
 * @description: 确认单信息封装
 * @menu
 * @date 2022/5/16 20:59
 */
public class ConfirmOrderResult {
    @ApiModelProperty("包含优惠信息的购物车信息")
    private List<CartPromotionItem> cartPromotionItemList;
    @ApiModelProperty("用户收货地址列表")
    private List<UmsMemberReceiveAddress> memberReceiveAddressList;
    @ApiModelProperty("用户可用优惠券列表")
    private List<SmsCouponHistoryDetail> couponHistoryDetailList;
    @ApiModelProperty("积分使用规则")
    private UmsIntegrationConsumeSetting integrationConsumeSetting;
    @ApiModelProperty("会员持有的积分")
    private Integer memberIntegration;
    @ApiModelProperty("计算的金额")
    private CalcAmount calcAmount;

    @Getter
    @Setter
    public static class CalcAmount{
        @ApiModelProperty("订单商品总金额")
        private BigDecimal totalAmount;
        @ApiModelProperty("运费")
        private BigDecimal freightAmount;
        @ApiModelProperty("活动优惠")
        private BigDecimal promotionAmount;
        @ApiModelProperty("应付金额")
        private BigDecimal payAmount;
    }
}
